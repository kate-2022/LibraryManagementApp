package lib.service;

import lib.StudentDaoFactory.StudentDaoFactory;
import lib.dao.IStudentDao;
import lib.model.Student;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao stDao;

	public String addStudent(Student studAcc) {
		stDao = StudentDaoFactory.getStudentService();
		return stDao.addStudent(studAcc);
	}

	public String deleteStudent(Integer libId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudent(Integer libId) {
		// TODO Auto-generated method stub
		return null;
	}

}
