package ks.m5s.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks.m5s.dao.IBooksDao;
import ks.m5s.dao.IStudentDao;
import ks.m5s.model.BookStatus;
import ks.m5s.model.Books;
import ks.m5s.model.Student;
import lombok.Data;

@Service
@Data
public class BookLendingServiceImpl implements IBookLendingService{
	
	public LocalDate date = LocalDate.now();
	
	private Integer noOfBooksOut;
	private List <String> namesOfBooksOut;
	
	@Autowired
	private IBooksDao repoBooks;
	
	@Autowired
	private IStudentDao repoStud;
	
	@Override
	public int bookCheckOut(Student student, BookStatus bookOut) {
		
		boolean available = bookOut.getBookOut();
		if(available) {
			noOfBooksOut = student.getNoOfBooksOut();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	;
				//set no of books lent
				student.setNoOfBooksOut(noOfBooksOut);
				//set date of loan
				bookOut.setDateOfLoan(date);
				student.setDateOfLoan(date);
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

	@Override
	public List<Books> getBooks(Integer bookId) {
		Optional<Books> optional = repoBooks.findById(bookId);
		return (List<Books>) optional.get();		
		
	}


	@Override
	public void safeBookToCatalouge(Books book) {
	repoBooks.save(book);
		
	}



}
