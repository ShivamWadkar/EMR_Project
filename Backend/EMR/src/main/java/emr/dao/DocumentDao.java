package emr.dao;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emr.pojo.Document;
import emr.repositories.MyDocumentRepository;

@Repository
public class DocumentDao {
	
	@Autowired
	MyDocumentRepository repo;
	
	public void addDocument(String type,String date,String description,Blob file) {
		
		
	}

	public List<Document> getAllDocument()
	{
		return repo.findAll();
		
	}
	
	public List<Document> getDocumentById(int id)
	{
		return repo.getDocumentById(id);
		
	}
	
	public void deleteDocument(int id)
	{
		repo.deleteById(id);
	}	
	

}
