package ks.m5s.service;

import java.util.List;

import ks.m5s.model.BookStatus;
import ks.m5s.model.Books;
import ks.m5s.model.Student;

public interface IBookLendingService {
	
	public String studentLogIn();
	
	public String librarianLogIn();

	public List <Books> namesOfBooksOut();
		
	public int bookCheckOut(Student student, Books book);

	public List<Books> getBooks(Integer bookId);
	
	public void safeBookToCatalouge(Books book);
	
	public void deletBookById(Integer id);
	
	public List<Books> displayCatalogue();
}
