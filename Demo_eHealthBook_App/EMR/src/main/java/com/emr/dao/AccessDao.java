package com.emr.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.dto.AccessDto;
import com.emr.pojo.Access;
import com.emr.pojo.Doctor;
import com.emr.pojo.Patient;
import com.emr.repositories.MyAccessRepository;


@Repository
public class AccessDao {
	
	@Autowired
	private MyAccessRepository repo;
	
	public List<AccessDto> getAllAccessInfoForPatient(int id)
	{
		List<Access> list = repo.getAccessDataForPatient(id);
		List<AccessDto> dtoList = new ArrayList<>();
		for (Access li : list) {
			
			AccessDto adto = new AccessDto();
			adto.setId(li.getId());
			adto.setDoctorName(li.getDoctor().getFirstName()+" "+li.getDoctor().getLastName());
			int accStatus = li.getAccessStatus();
			String accessStatus = "";
			if(accStatus == 0) {
				
				accessStatus="Inactive";
			}
			else {
				accessStatus="Active";
			}
			adto.setStatus(accessStatus);
			
			dtoList.add(adto);
		}
		
		return dtoList;
	}
	
	public List<AccessDto> getAllAccessInfoForDoctor(int id)
	{
		List<Access> list = repo.getAccessDataForDoctor(id);
		List<AccessDto> dtoList = new ArrayList<>();
		for (Access li : list) {
			
			AccessDto adto = new AccessDto();
			adto.setId(li.getId());
			adto.setPatientName(li.getPatient().getFirstName()+" "+li.getPatient().getLastName());
			int accStatus = li.getAccessStatus();
			String accessStatus = "";
			if(accStatus == 0) {
				
				accessStatus="Inactive";
			}
			else {
				accessStatus="Active";
			}
			adto.setStatus(accessStatus);
			
			dtoList.add(adto);
		}
		
		return dtoList;
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
	
	public void changeStatus(int id) {
		
		Access access = (Access)repo.findById(id).get();
		int status = access.getAccessStatus();
		int a = 1;
		
		if(status == 0) {
			
			repo.changeAccessStatus(id,a);
		}
		else {
			a=0;
			repo.changeAccessStatus(id, a);
		}
	}

}
