package ks.m5s.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Catalouge {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
		

	public List <Books> establishCatalouge(){
		Books book = null;
		Books book2 = null;
		List <Books> bookCatalouge = null;
		bookCatalouge.add(book);
		book.compareTo(book2);
		return bookCatalouge;
	}
	

}
