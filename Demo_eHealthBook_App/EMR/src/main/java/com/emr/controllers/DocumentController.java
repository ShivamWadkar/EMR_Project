package com.emr.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.emr.dao.DocumentDao;
import com.emr.dto.DocumentDto;
import com.emr.pojo.Access;
import com.emr.pojo.Doctor;
import com.emr.pojo.Document;
import com.emr.pojo.Patient;
import com.emr.repositories.MyAccessRepository;
import com.emr.repositories.MyDoctorRepository;
import com.emr.repositories.MyPatientRepository;

@Controller
public class DocumentController {

	@Autowired
	DocumentDao dao;

	@Autowired
	MyPatientRepository prepo;
	
	@Autowired
	MyAccessRepository arepo;
	
	@Autowired
	MyDoctorRepository drepo;

	@PostMapping("/add_document")
	public String addDocument(HttpServletRequest request, @RequestParam String documentType,@RequestParam String documentDate,@RequestParam String description,@RequestParam("file") MultipartFile file){

		if(request.getSession().getAttribute("uname") != null) {
		
			String fileName = file.getOriginalFilename();
			
		String patientId = (String)request.getSession().getAttribute("uname");

		Patient patient = prepo.findByLoginId(patientId);
		
		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			System.out.println(blob.getClass().getName()); 
			dao.addDocument(patient,documentType,documentDate,fileName,description,blob);

			return "uploadDocuments";
		} catch (SQLException e) {

			e.printStackTrace();
			return "uploadDocuments";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "uploadDocuments";
		}
		}
		else
			return "patientLogin";
	}

	@GetMapping("/getalldocuments") 
	public ModelAndView  getAllDcouments(Model model,HttpServletRequest request) 
	{ 
		if(request.getSession().getAttribute("uname") != null) {
		String patientId =(String)request.getSession().getAttribute("uname");

		Patient patient = prepo.findByLoginId(patientId);

		List<Document> files = dao.getAllDocuments(patient.getId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("documents", files);
		mv.setViewName("showDocuments");
		return mv;
		}
		else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("errormsg", "You have to login first to access documents !");
			mv.setViewName("patientLogin");
			return mv;
		
		}
			
	}

	@GetMapping("/getdocument/{id}") 
	public ResponseEntity<byte[]> getFile(@PathVariable int id) {
		
		int decriptedId = id/8659;
		System.out.println(decriptedId);
		
		DocumentDto d = dao.getdoc(decriptedId); 


		return ResponseEntity.ok() .header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + d.getName() + "\"")
				.body(d.getFile()); 
	} 
	
	@GetMapping("/deleteDocument/{id}")
	public String deleteById(HttpServletRequest request,@PathVariable int id) {
		
		if(request.getSession().getAttribute("uname") != null) {
			try {
				int decriptedId = id/8659;
				System.out.println("In delete document !!!!!");
				dao.deleteBook(decriptedId);
				System.out.println("After deleting the document !!!!");
				
				
				return "redirect:/getalldocuments";
			}
			catch (Exception e) {

				e.printStackTrace();
				return "patientLogin";
			}

			}
			else {
				
				return "patientLogin";
			
			}
	}
	
	@PostMapping("/doctor_view_patient")
	public ModelAndView doctorViewPatient(Model model,HttpServletRequest request, @RequestParam int accessId) {
		
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("uname") != null) {
			String doctorUserName =(String)request.getSession().getAttribute("uname");

			Doctor doctor = drepo.findByLoginId(doctorUserName);
			Access acc = (Access)arepo.findById(accessId).get();
			int patientId = acc.getPatient().getId();
			
			Access isValid = arepo.getAccessById(patientId, doctor.getId());
			
			if(isValid != null && isValid.getAccessStatus() == 1) {
				
				List<Document> files = dao.getAllDocuments(patientId);
				
				mv.addObject("documents", files);
				mv.setViewName("showPatient");
				return mv;
			}
			else {
				
				mv.addObject("result", "You don't have access to the patient");
				mv.setViewName("requestAccess");
				return mv;
			}
			
			
			}
			else {
				
				mv.addObject("errormsg", "You have to login first to access documents !");
				mv.setViewName("patientLogin");
				return mv;
			
			}
	}
	
}





