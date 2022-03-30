package study;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.Books;

@Repository
public interface MyRepository extends JpaRepository<Books, Integer>{

	public List<Books> findByBookName(String name);

	//public void addbook(int id, String name, int cost);
	
	
	
}
