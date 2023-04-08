package lib.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import lib.util.BooksUtil;
import lib.util.StudentUtil;
import lib.model.Books;


public class BookPersistApp {

	public static void main(String[] args) throws Exception {
	
		Session session = null;
		SessionFactory sessionfactory = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			session = BooksUtil.getSession();
			
			if(session !=null)
				transaction = session.beginTransaction();
			if (transaction != null) {
				
				Books newBook = new Books();
				newBook.setTitle("The Nanny");
				newBook.setAuthor("Fran Drescher");
				newBook.setField(1);
				newBook.setBid(1);
				
				session.persist(newBook);
				flag = true;
			}
			
			
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(flag) {
				transaction.commit();
				System.out.println("New book successfully saved to database");
			} else { 
				if(transaction != null)
				transaction.rollback();
				System.out.println("Book insertion failed..");
			}
			
			if (session !=null)
				StudentUtil.closeSession();
				if (sessionfactory !=null)
				StudentUtil.closeSessionFactory();
			
		}
		
		

	}

}
