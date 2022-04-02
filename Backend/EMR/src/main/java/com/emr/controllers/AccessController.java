package com.emr.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emr.dao.AccessDao;
import com.emr.dto.AccessDto;
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

	@RequestMapping("/access_control")
	public ModelAndView controlAccess(Model model,HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("uname") != null) {
			String patientId = (String)request.getSession().getAttribute("uname");
			Patient patient = patientRepo.findByLoginId(patientId);

			List<AccessDto> list = dao.getAllAccessInfo(patient.getId());
			
			mv.addObject("list", list);
			mv.setViewName("accessControl");

			return mv;
		}
		else {

			
			mv.addObject("errormsg", "You have to login first to access documents !");
			mv.setViewName("patientLogin");
			return mv;
		}
	}

	@PostMapping("/change_status") 
	public String getFile(Model model,HttpServletRequest request,@RequestParam int id) {
		System.out.println("first"+id);
		if(request.getSession().getAttribute("uname") != null) {
			

			dao.changeStatus(id);
			System.out.println("After status chnage");
			
			return "redirect:/access_control";
		}
		else {

			return "patientLogin";
		}
	} 
	
	@PostMapping("/requestAccess")
	public ModelAndView getAllAccessInfo(Model model,HttpServletRequest request,@RequestParam String patientUname)
	{
		if(request.getSession().getAttribute("uname") != null) {

			ModelAndView mv = new ModelAndView();
			String doctorId =(String)request.getSession().getAttribute("uname");

			Patient patient = patientRepo.findByLoginId(patientUname);
			if(patient == null) {
				
				mv.addObject("result", "No patient with this user name");
				mv.setViewName("requestAccess");
				return mv;
			}
			Doctor doctor = doctorRepo.findByLoginId(doctorId);

			String output = dao.saveRequest(patient, doctor);

			

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
			mv.addObject("errormsg", "You have to login first to access !");
			mv.setViewName("doctorLogin");
			return mv;

		}



	}



	@GetMapping("/getAccessByDoctorId/{id}")
	public void getAccessByDoctorId(@PathVariable("id") int id)
	{

	}




}
