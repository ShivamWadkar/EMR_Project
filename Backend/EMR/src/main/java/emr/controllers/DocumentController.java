package emr.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import emr.dao.DocumentDao;
import emr.pojo.Document;

@Controller
public class DocumentController {
	
	@Autowired
	DocumentDao dao;
	
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
	public String addDocument(@RequestParam String documentType,@RequestParam String date,@RequestParam String description,@RequestParam("file") MultipartFile file){
		
		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.addDocument( documentType,date,description,blob);
			
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
	
	@DeleteMapping("/deleteDocument/{id}")
	public void deleteDocument(@PathVariable("id") int id)
	{
		dao.deleteDocument(id);
	}

}
