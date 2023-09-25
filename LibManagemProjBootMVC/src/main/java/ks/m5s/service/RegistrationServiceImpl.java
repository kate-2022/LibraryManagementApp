package ks.m5s.service;

import ks.m5s.dao.ILibrarianDao;
import ks.m5s.dao.IStudentDao;


public class RegistrationServiceImpl implements IRegistrationService {
	
	private ILibrarianDao repoLib;
	private IStudentDao repoStud;

	@Override
	public String registerLibrarian() {
		
		return "libReg";
	}
	@Override
	public String registerStudent() {
	
		return "studentReg";
	}
	@Override
	public void deleteLibrAccountById(int id) {
		repoLib.deleteById(id);
		System.out.println("Librarian according id" + id + "was deleted successfully.");
	}
	
	
	@Override
	public void deleteStudAccount(int id) {
		repoStud.deleteById(id);
		System.out.println("Student according id" + id + "was deleted successfully.");
		
	}


}