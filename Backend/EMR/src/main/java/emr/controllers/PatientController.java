package emr.controllers;

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

import emr.dao.PatientDao;
import emr.pojo.Patient;


@Controller
public class PatientController {


	@Autowired
	PatientDao dao;

	@RequestMapping("/index")
	public String showIndex() {

		return "index";
	}

	@RequestMapping("/login")
	public String toLogin() {

		return "patientLogin";
	}

	@RequestMapping("/signup")
	public String pSignUp() {

		System.out.println("in signup");
		return "patientSignup";
	}

	@PostMapping("/verify")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {

		Patient result = dao.verifyUser(uname, pass);
		
		if(result != null) {

			model.addAttribute("patient", result);
			return "home";
		}
		else {

			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "login";
		}
	}

	@PostMapping("/addPatient")
	public String addProduct(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dob,@RequestParam String gender,@RequestParam String email,@RequestParam String contactNo,
			@RequestParam String address,@RequestParam String bloodGroup,@RequestParam String uname,@RequestParam String password,@RequestParam("file") MultipartFile file){
		
		
		System.out.println("In add patient");


		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.signUp( firstName,  lastName,  dob,  gender,  email,  contactNo,
					address,  bloodGroup,  uname,  password,  blob, email);
			
			return "login";
		} catch (SQLException e) {

			e.printStackTrace();
			return "patientSignup";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "patientSignup";
		}



	}

}
