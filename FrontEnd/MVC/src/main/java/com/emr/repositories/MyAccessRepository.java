package com.emr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emr.pojo.Access;




public interface MyAccessRepository extends JpaRepository<Access,Integer>{

	
	  @Query(value="select * from access_tbl where patient_id=:id",nativeQuery = true)
	  public List<Access> getAccessByDoctorId(@Param("id") int id);
	 
}
