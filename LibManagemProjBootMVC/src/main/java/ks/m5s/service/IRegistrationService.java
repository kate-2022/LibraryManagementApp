package ks.m5s.service;


public interface IRegistrationService {
	
	public String registerLibrarian();
	
	public String confirmLibReg();

	public String registerStudent();
	
	public String confirmStudReg();
	
	public void deleteLibrAccountById(int id);
	
	public void deleteStudAccount(int id);
	
}
