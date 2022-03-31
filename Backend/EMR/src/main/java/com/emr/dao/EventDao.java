package com.emr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.pojo.Event;
import com.emr.repositories.MyEventRespository;

@Repository
public class EventDao {
	
	@Autowired
	MyEventRespository repo;
	
	public List<Event> getAllEvents()
	{
		return repo.findAll();
		
	}
	
	public List<Event> getEventById(int id)
	{
		return repo.getEventById(id);
		
	}

}
