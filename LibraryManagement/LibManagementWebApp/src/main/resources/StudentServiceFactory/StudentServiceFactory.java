package lib.StudentServiceFactory;

import lib.dao.IStudentDao;
import lib.service.IStudentService;
import lib.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static IStudentService studentService;
	
	private StudentServiceFactory() {}
	
	public static IStudentService getStudentService() {
		if(studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
		
	}

}
