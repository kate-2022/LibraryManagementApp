package lib.service;

import lib.model.Student;

public interface IStudentService {
	
	public String addStudent(Student studAcc);
	
	public Student  searchStudent(Integer libId);
	
	public String  deleteStudent(Integer libId);

}
