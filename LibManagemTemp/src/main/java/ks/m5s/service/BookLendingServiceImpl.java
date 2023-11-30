package ks.m5s.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks.m5s.dao.IBooksDao;
import ks.m5s.dao.ICatalogueDao;
import ks.m5s.dao.IStudentDao;
import ks.m5s.model.Books;
import ks.m5s.model.Catalouge;
import ks.m5s.model.Student;
import lombok.Data;

@Service
@Data
public class BookLendingServiceImpl implements IBookLendingService {
	
	public LocalDate date = LocalDate.now();
	
	private Integer noOfBooksOut;
	private List <Books>BooksOut;
	private Catalouge catalogue;
	Scanner scan = new Scanner(System.in);
	private char[]pw;
	
	@Autowired
	private IBooksDao repoBooks;
	
	@Autowired
	private IStudentDao repoStud;
	
	@Autowired 
	private ICatalogueDao repoCat;
	
	private Logger logger = LoggerFactory.getLogger(BookLendingServiceImpl.class);
	
	// log 19 -24
	
	@Override
	public String studentLogIn(Student student) {
		System.out.println("Please enter your password"); // NOT console based!!
	   pw = scan.next().toCharArray();  // ..
	   if (pw.equals(student.getPassword())) {
		   return "pwSuccess";			   
	   }
		return"pwFail";
	}
	
	
	@Override
	public String librarianLogIn() {
		return "libLogIn";
	}
	
	
	
	@Override
	public int bookCheckOut(Student student, Books book) {
		
		logger.info("bookCheckOut()-ServiceImpl_service method was called - log19a");
		
		boolean available = book.getBookStatus();
		if(available) {
			noOfBooksOut = student.getNoOfBooksOut();
			if (noOfBooksOut <3) {
				noOfBooksOut++;	;
				//set no of books lent
				student.setNoOfBooksOut(noOfBooksOut+1);
				//set date of loan
				book.setDateOfLoan(date);
				book.setDateOfLoan(date);
				// add Book to List of Books out
				BooksOut.add(book);
				
				if (noOfBooksOut>=3) {
					System.out.println("Limit reached, no additional book loan possible!");	
				}
			}
		}	
		logger.info("bookCheckOut()-ServiceImpl_service method was called - log19b");
		return noOfBooksOut;
		
	}
	

	@Override
	public List<Books> namesOfBooksOut() {
		logger.info("namesOfBooksOut()-ServiceImpl_service method was called - log20");
		return (List<Books>) repoBooks.findAll();
	}

	@Override
	public List<Books> getBooks(Long bookId) {
		Optional<Books> optional = repoBooks.findById(bookId);
		logger.info("getBooks()-ServiceImpl_service method was called - log21");
		return (List<Books>) optional.get();		
		
	}


	@Override
	public void safeBookToCatalouge(Books book) {
	repoBooks.save(book);
	logger.info("safeBookToCatalougue()-ServiceImpl_service method was called - log22");
	}


	@Override
	public Catalouge displayCatalogue() {
		logger.info("displayCatalogue()-ServiceImpl_service method was called - log23");
		catalogue=(Catalouge)repoBooks.findAll();		
		return catalogue;
	}


	@Override
	public void deletBookById(Long id) {
		repoBooks.deleteById(id);
		logger.info("deleteBooksById()-ServiceImpl_service method was called - log24");
		System.out.println("The book with the following id" + id + "was deleted from the current list.");
	}


		
	}


