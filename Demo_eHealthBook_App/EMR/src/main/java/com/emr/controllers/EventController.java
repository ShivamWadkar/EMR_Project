package com.emr.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.emr.dao.EventDao;
import com.emr.pojo.Event;
import com.emr.pojo.Patient;
import com.emr.repositories.MyPatientRepository;


@Controller
public class EventController {
	
    @Autowired
	EventDao dao;
    
	@Autowired
	MyPatientRepository prepo;
	
	@PostMapping("/add_event")
	public String addEvent(HttpServletRequest request,@RequestParam String eventDate,@RequestParam String description, @RequestParam String eventType){

		
		if(request.getSession().getAttribute("uname") != null) {
		
			
		String patientId = (String)request.getSession().getAttribute("uname");

		Patient patient = prepo.findByLoginId(patientId);
		 
	    dao.addEvents(patient,eventDate,description,eventType);

			return "uploadEvents";
		    }
			else
			{
			return "patientLogin";
			}
	}


	@GetMapping("/getallevents") 
	public ModelAndView  getAllDcouments(Model model,HttpServletRequest request) 
	{ 
		if(request.getSession().getAttribute("uname") != null) {
		String patientId =(String)request.getSession().getAttribute("uname");

		Patient patient = prepo.findByLoginId(patientId);

		List<Event> files = dao.getAllEvents(patient.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("events", files);
		mv.setViewName("showEvents");
		return mv;
		}
		else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg", "You have to login first to access events !");
			mv.setViewName("patientLogin");
			return mv;
		
		}
			
	}

	
	
	@GetMapping("/deleteEvents/{id}")
	public String deleteById(HttpServletRequest request,@PathVariable int id) {
		
		if(request.getSession().getAttribute("uname") != null) {
			
			
			try {
				int decriptedId = id/8659;
				System.out.println("In delete Event !!!!!");
				dao.deleteEvent(decriptedId);
				System.out.println("After deleting the Event !!!!");
				
				
				return "redirect:/getallevents";
			}
			catch (Exception e) {

				e.printStackTrace();
				return "patientLogin";
			}

			}
			else {
				
				return "patientLogin";
			
			}
	}
	
	
}


