package lib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import lib.model.Student;
import lib.util.HibernateUtil;


// Persistence logic 
public class StudentDaoImpl implements IStudentDao{
	
	Session session = HibernateUtil.getSession();

	@SuppressWarnings("finally")
	public String addStudent(Student studAcc) {
		System.out.println(studAcc);
		
		Transaction transaction = null;
		Boolean flag = false;
		
		try {
			transaction = session.beginTransaction();
			session.persist(studAcc);
			flag=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				transaction.commit();
				return "sucess";
			} else {
				transaction.rollback();
				return "failure";
			}
		}
	}
	
	
	public Student searchStudent(Integer libId) {	
		return session.get(Student.class, libId);	
	}


	@SuppressWarnings("finally")
	public String deleteStudent(Integer libId) {
		
		Transaction transaction = null;
		Boolean flag = false;	
		Student studAcc = searchStudent(libId);
		if(studAcc != null) {
			
			try {
				transaction = session.beginTransaction();
				session.remove(studAcc);
				flag = true;
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(flag) {
					transaction.commit();
					return "success";
				} else {
					transaction.rollback();
					return "failure";
				}
			}
		} else {
			return "entry not found";
		}
		
		
	}



}
