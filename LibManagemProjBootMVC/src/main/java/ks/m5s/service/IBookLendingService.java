package ks.m5s.service;

import java.util.List;

import ks.m5s.model.Books;
import ks.m5s.model.Student;

public interface IBookLendingService {

	public List <Books> namesOfBooksOut();
		
	public int bookCheckOut(Integer studLibId, Books bookOut);
}
