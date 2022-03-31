package com.emr.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.pojo.Patient;

public interface MyPatientRepository extends JpaRepository<Patient,Integer>{

	public Patient findByLoginId(String uname);
	//public Patient findByPassword(String password);
}
