package ks.m5s.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ks.m5s.service.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Component
public class BookCatalogue {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	private String bookName;
	private String authorLastName;
	private String authorFirstName;
	private Date yearOfPublish;
	
	@Autowired
	BookStatus status;
	


}
