package lib.service;

import lib.model.StudentAcc;

public interface IStudentService {
	
	public String addStudent(StudentAcc studAcc);
	
	public String  searchStudent(Integer libId);
	
	public String  deleteStudent(Integer libId);

}
