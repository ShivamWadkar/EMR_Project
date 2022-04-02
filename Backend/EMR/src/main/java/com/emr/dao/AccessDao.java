package com.emr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.pojo.Access;
import com.emr.pojo.Doctor;
import com.emr.pojo.Patient;
import com.emr.repositories.MyAccessRepository;


@Repository
public class AccessDao {
	
	@Autowired
	private MyAccessRepository repo;
	
	public List<Access> getAllAccessInfo(String id)
	{
		return repo.findAll();
		
		
		
	}
	
	public String saveRequest(Patient patient,Doctor doctor) {
		
		int patientId = patient.getId();
		int doctorId = doctor.getId();
		Access checkAccess = repo.getAccessById(patientId, doctorId);
		
		if(checkAccess == null) {
			
			Access acc = new Access();
			acc.setDoctor(doctor);
			acc.setPatient(patient);
			
			repo.save(acc);
			
			return "Request Sent";
		}
		else {
			
			return "Already Requested";
		}
		
	}
	
//	public void getAccessByDoctorId(int id)
//	{
//		return repo.getAccessByDoctorId(id);
//		
//	}
	

}
