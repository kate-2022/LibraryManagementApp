package lib.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import lib.util.StudentUtil;
import lib.model.StudentAcc;

public class StudentPersistApp {

	public static void main(String[] args) throws Exception {
	
		Session session = null;
		SessionFactory sessionfactory = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			session = StudentUtil.getSession();
			
			if(session !=null)
				transaction = session.beginTransaction();
			if (transaction != null) {
				
				StudentAcc student = new StudentAcc();
				student.setEnrollmentNo(012345);
				student.setLastName("Fine");
				student.setFirstName("Fran");
				student.setLibId(01);
				
				session.persist(student);
				flag = true;
				
			}

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(flag) {
				transaction.commit();
				System.out.println("New user successfully saved to database");
			}else {
				if(transaction != null)
				transaction.rollback();
				System.out.println("User account creation failed..");
			}
			if (session !=null)
			StudentUtil.closeSession();
			if (sessionfactory !=null)
			StudentUtil.closeSessionFactory();
			
		}
		
		

	}

}
