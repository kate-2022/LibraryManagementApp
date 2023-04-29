package ks.m5s.service;

import java.time.LocalDate;

import ks.m5s.model.Books;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
import ks.m5s.model.Student;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
public class BookLendingManagement {
	
	private Student student;
	
	@Id
	private Integer studLibId;
	private Integer noOfBooksOut;
	
	@Autowired
	private static LocalDate today;
	
	
	public Integer bookCheckOut(Integer studLibId, Books bookOut) {
			noOfBooksOut = student.getNoOfBooksLent();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	
				// add Book to List of Books out
			student.setNoOfBooksLent(noOfBooksOut);
			if (noOfBooksOut>=3) {
				System.out.println("Limit reached, no additional book loan possible!");	
			}
		}
			
		return noOfBooksOut;
	}
	
	

	
	

}
