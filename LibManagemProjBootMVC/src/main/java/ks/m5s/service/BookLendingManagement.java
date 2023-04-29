package ks.m5s.service;

import java.sql.Date;
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
	private Date dateOfLoan;
	
	@Autowired
	private static LocalDate today;
	
	
	public Integer bookCheckOut(Integer studLibId, Books bookOut) {
			boolean available = bookOut.getBookAvailable();
			if(available) {
			noOfBooksOut = student.getNoOfBooksLent();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	;
			//set no of books lent
			student.setNoOfBooksLent(noOfBooksOut);
			//set date of loan
			bookOut.setDateOfLoan(dateOfLoan);
			// add Book to List of Books out
			student.getListOfBooksLent().add(bookOut);
				
			if (noOfBooksOut>=3) {
				System.out.println("Limit reached, no additional book loan possible!");	
			}
		}
			}	
		return noOfBooksOut;
			
	}
	
	

	
	

}
