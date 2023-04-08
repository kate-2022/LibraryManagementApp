package lib.StudentDaoFactory;

import lib.dao.IStudentDao;
import lib.dao.StudentDaoImpl;


public class StudentDaoFactory {
	
	private static IStudentDao studentDao;
	
	private StudentDaoFactory() {}
	
	public static IStudentDao getStudentDao() {
		if(studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
		
	}

}
