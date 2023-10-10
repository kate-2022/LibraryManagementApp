package ks.m5s.service;


public interface IRegistrationService {
	
	public String registerLibrarian();

	public String registerStudent();
	
	public void deleteLibrAccountById(int id);
	
	public void deleteStudAccount(int id);
	
}
