package com.emr.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emr.dto.DocumentDto;
import com.emr.pojo.Document;
import com.emr.pojo.Patient;
import com.emr.repositories.MyDocumentRepository;


@Repository
public class DocumentDao {

	@Autowired
	MyDocumentRepository repo;


	public void addDocument(Patient patient,String type,String date,String fileName,String description,Blob file) {

		Document doc = new Document();
		doc.setPatient(patient);
		doc.setDocumentDescription(description);
		doc.setDocument(file);
		doc.setDocumentDate(Date.valueOf(date));
		doc.setDocumentname(fileName);
		doc.setDocumentType(type);
		repo.save(doc);

	}

	public List<Document> getAllDocuments(int id)
	{
		return repo.findAll();
	}


	public DocumentDto getdoc(int id) 
	{ 
		Document doc =  repo.findById(id).get();
		String name = doc.getDocumentname();
		Blob blob = doc.getDocument();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte[] buf = new byte[1024];

		try {
			InputStream in = blob.getBinaryStream();
			int n = 0;

			while ((n=in.read(buf))>=0)
			{
				baos.write(buf, 0, n);
			}
			in.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		byte[] bytes = baos.toByteArray();


		DocumentDto docDto = new DocumentDto();

		docDto.setName(name);
		docDto.setFile(bytes);
		return docDto;
	}

	public void deleteBook(int id) {

		Optional<Document> obj =  repo.findById(id);
		
		Document doc = obj.get();
		//System.out.println(doc);
		repo.delete(doc);
	}


}
