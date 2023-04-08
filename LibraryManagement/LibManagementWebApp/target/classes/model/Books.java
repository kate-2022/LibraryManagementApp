package lib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

@Entity
@Table(name ="BOOK ARCHIVE")
public class Books {
	
	@Id
	private int bid;
	private String title;
	private String author;
	private int field;
	

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getField() {
		return field;
	}


	public void setField(int field) {
		this.field = field;
	}


	@Override
	public String toString() {
		return "Books [book id=" + bid + ", title=" + title + ", author=" + author + ", field=" + field + "]";
	}



	
	

	


}
