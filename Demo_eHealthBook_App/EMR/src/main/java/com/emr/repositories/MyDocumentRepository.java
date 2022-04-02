package com.emr.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emr.pojo.Document;


public interface MyDocumentRepository extends JpaRepository<Document,Integer>{
	
	  @Query(value="select * from document_tbl where patient_id=:id",nativeQuery = true)
	  public List<Document> getDocumentById(@Param("id") int id);
	  
		/*
		 * @Query(value="select * from document_tbl where patient_id=:id",nativeQuery =
		 * true) public Document findById(@Param("id") int id);
		 */
	  
}
