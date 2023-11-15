package ks.m5s.dao;

import org.springframework.data.repository.CrudRepository;
import ks.m5s.model.Student;

public interface IStudentDao extends CrudRepository<Student, Long> {
	
	
	

}
