package lib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import lib.model.StudentAcc;
import lib.util.HibernateUtil;


// Persistence logic 
public class StudentDaoImpl implements IStudentDao{
	
	Session session = HibernateUtil.getSession();

	@SuppressWarnings("finally")
	public String addStudent(StudentAcc studAcc) {
		System.out.println(studAcc);
		
		Transaction transaction = null;
		Boolean flag = false;
		
		try {
		transaction = session.beginTransaction();
		session.save(studAcc);
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
	
	
	public StudentAcc searchStudent(Integer libId) {
		return session.get(StudentAcc.class, libId);	
	}


	@SuppressWarnings("finally")
	public String deleteStudent(Integer libId) {
		Transaction transaction = null;
		Boolean flag = false;	
		StudentAcc studAcc = searchStudent(libId);
		if(studAcc != null) {
			
			try {
				transaction = session.beginTransaction();
				session.delete(studAcc);
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
