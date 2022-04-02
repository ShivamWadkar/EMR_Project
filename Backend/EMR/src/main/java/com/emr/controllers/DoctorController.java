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
import org.springframework.web.servlet.ModelAndView;

import com.emr.dao.DoctorDao;
import com.emr.dto.DoctorDto;


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
	

	@RequestMapping("/requestPatientAccess")
	public ModelAndView showIndex() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("result", "Welcome Doctor");
		mv.setViewName("requestAccess");
		return mv;
	}
	
	@RequestMapping("/viewPatient")
	public String viewPatient() {

		return "viewPatient";
	}
	
	@RequestMapping("/doctor_dashboard")
	public String showDashboard(Model model,HttpServletRequest request) {

		if(request.getSession().getAttribute("uname") != null) {
			String doctorId = (String)request.getSession().getAttribute("uname");
			DoctorDto doctor = dao.getDoctor(doctorId);
			model.addAttribute("doctor", doctor);
			return "doctorDashboard";
		}
		else

			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "doctorLogin";
	}

	@RequestMapping("/edit_doctor_profile")
	public String editProfile(Model model,HttpServletRequest request) {

		if(request.getSession().getAttribute("uname") != null) {

			String doctorId = (String)request.getSession().getAttribute("uname");
			DoctorDto doctor = dao.getDoctor(doctorId);
			model.addAttribute("doctor", doctor);
			return "editdoctorprofile";

		}
		else {
			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "doctorLogin";
		}
	}
	
	@PostMapping("/verify_doctor")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {

		System.out.println("In verify doctor");
		DoctorDto result = dao.verifyUser(uname, pass);
		System.out.println("Doctor verified");
		if(result != null) {

			model.addAttribute("doctor", result);
			return "doctorDashboard";
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
	
	@PostMapping("/update_doctor_profile")
	public String updateDoctor(Model model,HttpServletRequest request,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String gender,@RequestParam String contactNo,
			@RequestParam String specialization,@RequestParam float experience,@RequestParam String education,@RequestParam("file") MultipartFile file){

		if(request.getSession().getAttribute("uname") != null) {
			String uname = (String)request.getSession().getAttribute("uname");
			byte[] byteArr;
			Blob blob;
			try {
				byteArr = file.getBytes();
				blob = new SerialBlob(byteArr);
				dao.update(   firstName,  lastName,  gender,  contactNo,
						  specialization,  experience,  education, blob, uname);

				String doctorId = (String)request.getSession().getAttribute("uname");
				
				DoctorDto doctor = dao.getDoctor(doctorId);

				if(doctor != null) {
					model.addAttribute("doctor", doctor);
				}
				return "editdoctorprofile";
			} catch (SQLException e) {

				e.printStackTrace();
				return "editdoctorprofile";
			}
			catch (IOException e1) {

				e1.printStackTrace();
				return "editdoctorprofile";
			}
		}
		else {
			return "editdoctorprofile";
		}


	}
	
	@RequestMapping(value="/dSignOut",method = RequestMethod.GET) 
	public String signOut(Model model,HttpServletRequest request){
		HttpSession session=request.getSession(); 

		//session.removeAttribute("uname"); 
		session.setAttribute("uname", null); 
		//session.invalidate(); 
		
		System.out.println("session id after invalidating session is:"+session.getId()); 

		return "index";
	}
}
