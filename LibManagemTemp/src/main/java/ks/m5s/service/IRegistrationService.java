package ks.m5s.service;

import ks.m5s.model.Librarian;
import ks.m5s.model.Student;

public interface IRegistrationService {

	public void registerLibrarian(Librarian librarian);
	
	public String confirmLibReg();

	public void registerStudent(Student student);
	
	public String confirmStudReg();
	
	public void deleteLibrAccountById(int id);
	
	public void deleteStudAccount(int id);

	
}
