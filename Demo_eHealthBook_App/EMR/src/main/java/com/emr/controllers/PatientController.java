package com.emr.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.emr.dao.PatientDao;
import com.emr.dto.PatientDto;


@Controller
public class PatientController {


	@Autowired
	PatientDao dao;

	@RequestMapping("/index")
	public String showIndex() {

		return "index";
	}

	@RequestMapping("/patient_dashboard")
	public String showDashboard(Model model,HttpServletRequest request) {

		if(request.getSession().getAttribute("uname") != null) {
			String patientId = (String)request.getSession().getAttribute("uname");
			PatientDto patient = dao.getPatient(patientId);
			model.addAttribute("patient", patient);
			return "patientDashboard";
		}
		else

			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "patientLogin";
	}

	
	
	@RequestMapping("/edit_patient_profile")
	public String editProfile(Model model,HttpServletRequest request) {

		if(request.getSession().getAttribute("uname") != null) {

			String patientId = (String)request.getSession().getAttribute("uname");
			PatientDto patient = dao.getPatient(patientId);
			model.addAttribute("patient", patient);
			return "editpatientprofile";

		}
		else {
			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "patientLogin";
		}
	}

	@RequestMapping("/upload_documents")
	public String uploadDocument() {

		return "uploadDocuments";
	}

	@RequestMapping("/upload_events")
	public String uploadEvents() {

		return "uploadEvents";
	}
	
	@RequestMapping("/patient_login")
	public String toLogin() {

		return "patientLogin";
	}

	@RequestMapping("/patient_signup")
	public String pSignUp() {

		return "patientSignup";
	}

	@PostMapping("/verify_patient")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {

		PatientDto result = dao.verifyUser(uname, pass);

		if(result != null) {

			model.addAttribute("patient", result);
			return "patientDashboard";
		}
		else {

			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "patientLogin";
		}
	}



	@PostMapping("/add_patient")
	public String addPatient(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dob,@RequestParam String gender,@RequestParam String email,@RequestParam String contactNo,
			@RequestParam String address,@RequestParam String bloodGroup,@RequestParam String uname,@RequestParam String password,@RequestParam("file") MultipartFile file){


		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.signUp( firstName,  lastName,  dob,  gender,  email,  contactNo,
					address,  bloodGroup,  uname,  password,  blob, email);

			return "patientLogin";
		} catch (SQLException e) {

			e.printStackTrace();
			return "patientSignup";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "patientSignup";
		}

	}

	@PostMapping("/update_patient_profile")
	public String updatePatient(Model model,HttpServletRequest request,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dob,@RequestParam String gender,@RequestParam String contactNo,
			@RequestParam String address,@RequestParam String bloodGroup,@RequestParam("file") MultipartFile file){

		if(request.getSession().getAttribute("uname") != null) {
			String uname = (String)request.getSession().getAttribute("uname");
			byte[] byteArr;
			Blob blob;
			try {
				byteArr = file.getBytes();
				blob = new SerialBlob(byteArr);
				dao.update( firstName,  lastName,  dob,  gender,  contactNo,
						address,  bloodGroup,  blob,uname);

				String patientId = (String)request.getSession().getAttribute("uname");
				PatientDto patient = dao.getPatient(patientId);

				if(patient != null) {
					model.addAttribute("patient", patient);
				}
				return "editpatientprofile";
			} catch (SQLException e) {

				e.printStackTrace();
				return "editpatientprofile";
			}
			catch (IOException e1) {

				e1.printStackTrace();
				return "editpatientprofile";
			}



		}
		return "editpatientprofile";



	}

	@RequestMapping(value="/signOut",method = RequestMethod.GET) 
	public String signOut(Model model,HttpServletRequest request){
		HttpSession session=request.getSession(); 

		session.removeAttribute("uname");   
		session.invalidate(); 
		System.out.println("session id after invalidating session is:"+session.getId()); 

		return "index";
	}

}
