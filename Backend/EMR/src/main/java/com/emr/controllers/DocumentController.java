package com.emr.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.emr.dao.DocumentDao;
import com.emr.dao.PatientDao;
import com.emr.pojo.Document;
import com.emr.pojo.Patient;
import com.emr.repositories.MyPatientRepository;

@Controller
public class DocumentController {
	
	@Autowired
	DocumentDao dao;
	
	@Autowired
	PatientDao pdao;
	
	@Autowired
	MyPatientRepository prepo;
	
	@GetMapping("/getAllDocument")
	public void getAllDocument()
	{
		List<Document> list = dao.getAllDocument();
		
		list.forEach(e->{
			System.out.println(e.getDocumentType() + ", " + e.getDocumentDescription());
		});
	}
	
	@GetMapping("/getDocumentByPatient/{id}")
	public void getDocumentById(@PathVariable("id") int id)
	{
		List<Document> list = dao.getDocumentById(id);
		
		list.forEach(e->{
			System.out.println(e);
		});
	}
	
	@PostMapping("/add_document")
	public String addDocument(HttpServletRequest request, @RequestParam String documentType,@RequestParam String documentDate,@RequestParam String description,@RequestParam("file") MultipartFile file){
		
		String patientId = (String)request.getSession().getAttribute("uname");
		//pdao.getUserByUserId(patientId);
		
		Patient patient = prepo.findByLoginId(patientId);
		//System.out.println(request.getSession().getAttribute("id"));
		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.addDocument(patient,documentType,documentDate,description,blob);
			
			return "patientLogin";
		} catch (SQLException e) {

			e.printStackTrace();
			return "patientSignup";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "patientSignup";
		}



	}

}
