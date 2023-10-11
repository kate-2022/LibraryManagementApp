package ks.m5s.service;

import java.util.List;

import ks.m5s.model.BookStatus;
import ks.m5s.model.Books;
import ks.m5s.model.Student;

public interface IBookLendingService {

	public List <Books> namesOfBooksOut();
		
	public int bookCheckOut(Student student, BookStatus bookOut);

	public List<Books> getBooks(Integer bookId);
	
	public void safeBookToCatalouge(Books book);
	
	public void deletBookById(Books book);
	
	public List<Books> displayCatalogue();
}
