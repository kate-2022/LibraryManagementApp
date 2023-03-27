package lib.StudentServiceFactory;

import lib.service.IStudentService;
import lib.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private StudentServiceFactory() {
		
	}
	
	private static IStudentService studentservice;
	
	public static IStudentService getStudentService() {
		if(studentservice == null) {
			studentservice = new StudentServiceImpl();
		}
		return studentservice;
		
	}

}
