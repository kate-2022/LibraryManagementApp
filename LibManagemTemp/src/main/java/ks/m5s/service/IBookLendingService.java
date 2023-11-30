package ks.m5s.service;

import java.util.List;

import ks.m5s.model.Books;
import ks.m5s.model.Catalouge;
import ks.m5s.model.Student;

public interface IBookLendingService {
	
	
	String studentLogIn(Student student);
	
	public String librarianLogIn();

	public List <Books> namesOfBooksOut();
		
	public int bookCheckOut(Student student, Books book);

	public List<Books> getBooks(Long bookId);
	
	public void safeBookToCatalouge(Books book);
	
	public void deletBookById(Long id);
	
	public Catalouge displayCatalogue();
}
