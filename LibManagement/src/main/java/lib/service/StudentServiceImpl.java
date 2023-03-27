package lib.service;

import lib.dao.IStudentDao;
import lib.model.StudentAcc;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao stDao;

	public String addStudent(StudentAcc studAcc) {
		stDao = StudentDaoFactory.getStudentDao();
		return stDao.addStudent(studAcc);
	}

	public String deleteStudent(Integer libId) {
		// TODO Auto-generated method stub
		return null;
	}

}
