package lib.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lib.model.StudentAcc;

public class StudentUtil {

	private static SessionFactory sessionfactory = null;	
	private static Configuration config= null;
	private static Session session = null;
	
	static {
		 sessionfactory = new Configuration().configure().
				 addAnnotatedClass(StudentAcc.class).
				 buildSessionFactory();
	}
	
	private StudentUtil() {	
	}
	
	public static Session getSession() {
		if (session == null)
			sessionfactory.openSession();
		return session;
	}
	
	public static void closeSession() {
		if (session!=null)
			session.close();
	}
	
	public static void closeSessionFactory() {
		if (sessionfactory!=null)
			sessionfactory.close();
	}
	
}
