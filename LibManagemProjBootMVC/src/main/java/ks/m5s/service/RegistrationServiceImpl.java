package ks.m5s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks.m5s.dao.ILibrarianDao;
import ks.m5s.dao.IStudentDao;
import ks.m5s.model.Librarian;
import ks.m5s.model.Student;
import lombok.Data;

@Service
@Data
public class RegistrationServiceImpl implements IRegistrationService {
	
	@Autowired
	private ILibrarianDao repoLib;
	
	@Autowired
	private IStudentDao repoStud;
	

	@Override
	public String registerLibrarian(Librarian librarian) {		
		repoLib.save(librarian);
		return "libReg";
	}
	
	@Override
	public String registerStudent(Student student) {
		repoStud.save(student);
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

	@Override
	public String confirmLibReg() {
		return "libRegConf";
	}

	@Override
	public String confirmStudReg() {
		return "studRegConf";
	}




}
