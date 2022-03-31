package com.emr.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.emr.dao.DoctorDao;
import com.emr.pojo.Doctor;

@Controller
public class DoctorController {

	@Autowired
	DoctorDao dao;

	@RequestMapping("/doctor_login")
	public String toLogin() {

		return "doctorLogin";
	}

	@RequestMapping("/doctor_signup")
	public String pSignUp() {

		return "doctorSignup";
	}

	@PostMapping("/verify_doctor")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {

		Doctor result = dao.verifyUser(uname, pass);
		
		if(result != null) {

			model.addAttribute("doctor", result);
			return "home";
		}
		else {

			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "doctorLogin";
		}
	}

	@PostMapping("/add_doctor")
	public String addProduct(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String gender,@RequestParam String education,@RequestParam String specialization,
			@RequestParam float experience,@RequestParam String contact,@RequestParam String email,@RequestParam String uname,@RequestParam String password,@RequestParam("file") MultipartFile file){


		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.signUp( firstName,  lastName,  gender,education,specialization,experience,contact,email,
					 uname, password,  blob);
			
			return "doctorLogin";
		} catch (SQLException e) {

			e.printStackTrace();
			return "doctorSignup";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "doctorSignup";
		}



	}
}
