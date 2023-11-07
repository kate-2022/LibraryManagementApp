package ks.m5s.service;

import java.util.List;

import ks.m5s.model.Books;
import ks.m5s.model.Student;

public interface IBookLendingService {
	
	
	String studentLogIn(Student student);
	
	public String librarianLogIn();

	public List <Books> namesOfBooksOut();
		
	public int bookCheckOut(Student student, Books book);

	public List<Books> getBooks(Integer bookId);
	
	public void safeBookToCatalouge(Books book);
	
	public void deletBookById(Integer id);
	
	public List<Books> displayCatalogue();
}
