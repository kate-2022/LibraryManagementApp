package lib.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionfactory = null;
	private static Session session = null;
	
	static {
		sessionfactory = new Configuration().configure().buildSessionFactory();
	}

	public static Session getSession() {
		if (session==null)
			session = sessionfactory.openSession();
		return session;
	}
	
	public static void closeSession(Session session) {
		if (session!=null)
			session.close();
	}
	
	public static void closeSessionFactory(SessionFactory sessionfactory) {
		if(sessionfactory!=null)
			sessionfactory.close();
	}
	
	public static void startUp() {
		System.out.println("+++++++++++++ Hibernate SetUp ++++++++++++++++");
	}
	
}
