package lib.dao;

import lib.model.StudentAcc;

public interface IStudentDao {

	public String addStudent(StudentAcc studAcc);
	
	public StudentAcc  searchStudent(Integer libId);
	
	public String  deleteStudent(Integer libId);
}
