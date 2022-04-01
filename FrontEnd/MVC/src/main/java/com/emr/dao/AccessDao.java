package com.emr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.pojo.Access;
import com.emr.repositories.MyAccessRepository;


@Repository
public class AccessDao {
	
	@Autowired
	MyAccessRepository repo;
	
	public List<Access> getAllAccessInfo()
	{
		return repo.findAll();
		
		
		
	}
	
	public List<Access> getAccessByDoctorId(int id)
	{
		return repo.getAccessByDoctorId(id);
		
	}
	

}
