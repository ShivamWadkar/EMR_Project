package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newbook")
public class Books {

	@Id
	@Column(name="bookid")
	private int bookId;
	
	@Column(name="bookname")
	private String bookName;
	
	@Column(name="cost")
	private int cost;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public Books() {

	}

	public Books(int bookId, String bookName, int cost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookId=" + bookId + ", bookName=" + bookName + ", cost=" + cost;
	}
	
	
}
