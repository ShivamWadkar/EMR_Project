package com.emr.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emr.dao.AccessDao;
import com.emr.pojo.Doctor;
import com.emr.pojo.Patient;
import com.emr.repositories.MyDoctorRepository;
import com.emr.repositories.MyPatientRepository;



@Controller
public class AccessController {
	
	@Autowired
	private AccessDao dao;
	
	@Autowired
	private MyPatientRepository patientRepo;
	
	@Autowired
	private MyDoctorRepository doctorRepo;
	
	@PostMapping("/requestAccess")
	public ModelAndView getAllAccessInfo(Model model,HttpServletRequest request,@RequestParam String patientUname)
	{
		if(request.getSession().getAttribute("uname") != null) {
			
			String doctorId =(String)request.getSession().getAttribute("uname");

			Patient patient = patientRepo.findByLoginId(patientUname);
			
			Doctor doctor = doctorRepo.findByLoginId(doctorId);
			
			String output = dao.saveRequest(patient, doctor);
			
			ModelAndView mv = new ModelAndView();
			
			if(output.equals("Request Sent")) {
				
				mv.addObject("result", "Request Sent");
				mv.setViewName("requestAccess");
			}
			else {
				
				mv.addObject("result", "Already Requested");
				mv.setViewName("requestAccess");
				
			}
			return mv;
			}
			else {
				ModelAndView mv = new ModelAndView();
				mv.addObject("errormsg", "You have to login first to access documents !");
				mv.setViewName("doctorLogin");
				return mv;
			
			}
		
		
	
	}
	
	
	
	@GetMapping("/getAccessByDoctorId/{id}")
	public void getAccessByDoctorId(@PathVariable("id") int id)
	{
		
	}
	
	
	

}
