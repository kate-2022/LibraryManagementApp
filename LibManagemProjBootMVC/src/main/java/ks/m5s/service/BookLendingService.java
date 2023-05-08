package ks.m5s.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ks.m5s.model.BookCatalogue;
import ks.m5s.model.Student;
import ks.m5s.service.BookStatus;

@Controller
@Data
public class BookLendingService {
	
	private Student student;
	private Integer noOfBooksOut;
	private List <String> namesOfBooksOut;
	
	@Autowired
	private static LocalDate today;
	
	
	public int bookCheckOut(Integer studLibId, BookStatus bookOut) {
			boolean available = bookOut.getBookAvailable();
			if(available) {
			noOfBooksOut = student.getNoOfBooksOut();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	;
			//set no of books lent
			student.setNoOfBooksOut(noOfBooksOut);
			//set date of loan
			bookOut.setDateOfLoan(today);
			// add Book to List of Books out
			namesOfBooksOut.add(null);
				
			if (noOfBooksOut>=3) {
				System.out.println("Limit reached, no additional book loan possible!");	
			}
		}
			}	
		return noOfBooksOut;
			
	}
	
	

	
	

}
