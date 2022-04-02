package com.emr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.pojo.Doctor;




public interface MyDoctorRepository extends JpaRepository<Doctor,Integer>{

	public Doctor findByLoginId(String uname);
	public Doctor findByPassword(String password);
}
