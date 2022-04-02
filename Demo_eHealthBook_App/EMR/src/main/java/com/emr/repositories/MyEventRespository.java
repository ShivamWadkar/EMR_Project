package com.emr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emr.pojo.Event;


public interface MyEventRespository extends JpaRepository<Event,Integer>{
	
	 @Query(value="select * from event_tbl where patient_id=:id",nativeQuery = true)
	  public List<Event> getEventById(@Param("id") int id);
	 
	 

	

}
