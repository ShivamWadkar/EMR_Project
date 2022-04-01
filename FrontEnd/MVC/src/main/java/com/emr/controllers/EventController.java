package com.emr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emr.dao.EventDao;
import com.emr.pojo.Event;


@Controller
public class EventController {
	
    @Autowired
	EventDao dao;
	
	@GetMapping("/getAllEvents")
	public void getAllEvents()
	{
		List<Event> list = dao.getAllEvents();
		
		list.forEach(e->{
			System.out.println(e.getEventDescription());
		});
	}
	
	@GetMapping("/getEventById/{id}")
	public void getEventById(@PathVariable("id") int id)
	{
		List<Event> list = dao.getEventById(id);
		
		list.forEach(e->{
			System.out.println(e);
		});
	}
	

}
