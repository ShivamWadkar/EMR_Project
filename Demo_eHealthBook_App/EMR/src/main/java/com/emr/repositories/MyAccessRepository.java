package com.emr.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emr.pojo.Access;




public interface MyAccessRepository extends JpaRepository<Access,Integer>{

	
	  @Query(value="select * from access_tbl where doctor_id=:id",nativeQuery = true)
	  public List<Access> getAccessDataForDoctor(@Param("id") int id);
	  
	  @Query(value="select * from access_tbl where patient_id=:patientId and doctor_id=:doctorId",nativeQuery = true)
	  public Access getAccessById(@Param("patientId") int patientId,@Param("doctorId") int doctorId);
	 
	  @Query(value="select * from access_tbl where patient_id=:id",nativeQuery = true)
	  public List<Access> getAccessDataForPatient(@Param("id") int id);
	  
	  @Query(value="update access_tbl set access_status=:a where access_id=:id",nativeQuery = true)
	  @Modifying
	  @Transactional
	  public void changeAccessStatus(@Param("id") int id,@Param("a") int a);
	  
}
