package ks.m5s.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);
	
	// log 13-18

	@Override
	public void registerLibrarian(Librarian librarian) {		
		repoLib.save(librarian);
	    logger.info("registerLibrarian()-ServiceImpl_service method was called - log 13");
	}
	
	@Override
	public void registerStudent(Student student) {
		repoStud.save(student);
		logger.info("registerStudent()-ServiceImpl_service method was called - log 14");
	}
	
	@Override
	public void deleteLibrAccountById(Long id) {
		repoLib.deleteById(id);
		logger.info("Librarian according id" + id + "was deleted successfully. - log 15");
	}
	
	
	@Override
	public void deleteStudAccount(Long id) {
		repoStud.deleteById(id);
		System.out.println("Student according id" + id + "was deleted successfully. - log 16");
		logger.info("Student according id" + id + "was deleted successfully. - log 16");
		
	}

	@Override
	public String confirmLibReg() {
		System.out.println("confirmLibReg()_ service method was called - log 17");
		logger.info("confirmLibReg()_ service method was called - log 17");
		return "libRegConf";
	}

	@Override
	public String confirmStudReg() {
		System.out.println("confirmStudReg()_ service method was called - log 18");
		logger.info("confirmStudReg()_ service method was called - log 18");
		return "studRegConf";
	}




}
