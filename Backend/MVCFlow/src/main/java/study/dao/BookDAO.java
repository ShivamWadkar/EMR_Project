package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.MyRepository;
import study.entity.Books;

@Repository
public class BookDAO {

	@Autowired
	MyRepository repo;
	
	public List<Books> getAllBooks(){
		
		return repo.findAll();
	}
	
	
	public List<Books> getBookDetails(String bookName) {
		
		return repo.findByBookName(bookName);
	}
	
	public void deleteBook(int id) {
		
		Optional<Books> be =  repo.findById(id);
		
		Books b = be.get();
		repo.delete(b);
	}
	
	public void addBook(int id,String name,int cost) {
		
		 Books b = new Books(id,name,cost);
		 repo.save(b);
	}


	
	
}
