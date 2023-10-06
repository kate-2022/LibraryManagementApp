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
	private Books bookOfInterest;
	private List <Object> namesOfBooksOut;
	
	@Autowired
	private IBooksDao repoBook;
	
	@Autowired
	private IStudentDao repoStud;
	
	
	@Override
	public List<Books> namesOfBooksOut() {
		List<Books> list = (List<Books>)repoBook.findAll();
		System.out.println(list);
		return list;
	}
	
	@Override
	public int bookCheckOut(Student student, Books bookToLend, BookStatus bookOut) {
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
				namesOfBooksOut.add(bookToLend);
				System.out.println(namesOfBooksOut);
				
				if (noOfBooksOut>=3) {
					System.out.println("Limit reached, no additional book loan possible!");	
				}
			}
		}	
		return noOfBooksOut;
		
	}
	
	
	@Override
	public Books getBook(Integer bookId) {
		// to avoid Null-Pointer-Exception when book is not available
		Optional<Books> optional = repoBook.findById(bookId);
		System.out.println(optional);
		return optional.get();
	}


}
