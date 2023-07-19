package ks.m5s.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import ks.m5s.dao.IBooksDao;
import ks.m5s.dao.IStudentDao;
import ks.m5s.model.Books;
import ks.m5s.model.Student;
import lombok.Data;

@Service
@Data
public class BookLendingServiceImpl implements IBookLendingService{
	
	public LocalDateTime date;
	
	private Student student;
	private Integer noOfBooksOut;
	private List <String> namesOfBooksOut;
	
	@Autowired
	private IBooksDao repoBooks;
	
	@Autowired
	private IStudentDao repoStud;
	
	@Override
	public int bookCheckOut(Integer studLibId, Books bookOut) {
		
		boolean available = bookOut.getBookAvailable();
		if(available) {
			noOfBooksOut = student.getNoOfBooksOut();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	;
				//set no of books lent
				student.setNoOfBooksOut(noOfBooksOut);
				//set date of loan
				bookOut.getDateOfLoan();
				// add Book to List of Books out
				namesOfBooksOut.add(null);
				
				if (noOfBooksOut>=3) {
					System.out.println("Limit reached, no additional book loan possible!");	
				}
			}
		}	
		return noOfBooksOut;
		
	}
	

	@Override
	public List<Books> namesOfBooksOut() {
		return (List<Books>) repoBooks.findAll();
	}


}
