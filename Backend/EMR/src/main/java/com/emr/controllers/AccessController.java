package com.emr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.emr.dao.AccessDao;
import com.emr.pojo.Access;



@Controller
public class AccessController {
	
	@Autowired
	AccessDao dao;
	
	@GetMapping("/getAllAccessInfo")
	public void getAllAccessInfo()
	{
		List<Access> list = dao.getAllAccessInfo();
		
		list.forEach(e->{
			System.out.println(e);
		});
	}
	
	
	@GetMapping("/getAccessByDoctorId/{id}")
	public void getAccessByDoctorId(@PathVariable("id") int id)
	{
		List<Access> list = dao.getAccessByDoctorId(id);
		
		list.forEach(e->{
			System.out.println(e);
		});
	}
	
	
	

}
