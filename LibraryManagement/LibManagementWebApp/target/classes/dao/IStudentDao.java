package lib.dao;

import lib.model.Student;

public interface IStudentDao {

	public String addStudent(Student studAcc);
	
	public Student  searchStudent(Integer libId);
	
	public String  deleteStudent(Integer libId);
}
