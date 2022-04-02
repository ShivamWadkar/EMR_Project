package com.emr.dao;

import java.sql.Date;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.pojo.Event;
import com.emr.pojo.Patient;
import com.emr.repositories.MyEventRespository;

@Repository
public class EventDao {
	
	@Autowired
	MyEventRespository repo;
	
	public List<Event> getAllEvents(int id)
	{
		return repo.findAll();
		
	}
	
	public List<Event> getEventById(int id)
	{
		return repo.getEventById(id);
		
	}


	public void deleteEvent(int id) {

		Optional<Event> obj =  repo.findById(id);
		
		Event event = obj.get();
		//System.out.println(event);
		repo.delete(event);
	}
	
	public void addEvents(Patient patient,String date,String description,String type) {

		Event event = new Event();
		event.setPatient(patient);
	
		event.setEventDate(Date.valueOf(date));
		event.setEventDescription(description);
		event.setEventType(type);
		repo.save(event);
		
	

	}
}
