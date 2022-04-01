package com.emr.dao;

import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.pojo.Document;
import com.emr.pojo.Patient;
import com.emr.repositories.MyDocumentRepository;

@Repository
public class DocumentDao {
	
	@Autowired
	MyDocumentRepository repo;
	
	public List<Document> getAllDocument()
	{
		return repo.findAll();
		
	}
	
	public List<Document> getDocumentById(int id)
	{
		return repo.getDocumentById(id);
		
	}
	
	
	public void addDocument(Patient patient,String type,String date,String description,Blob file) {
		
		Document doc = new Document();
		doc.setPatient(patient);
		doc.setDocumentDescription(description);
		doc.setDocument(file);
		doc.setDocumentDate(Date.valueOf(date));
		doc.setDocumentType(type);
		repo.save(doc);
		
	}
	

}
