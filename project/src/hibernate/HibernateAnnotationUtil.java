package hibernate;


//import javax.imageio.spi.ServiceRegistry;
import org.hibernate.service.*;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class HibernateAnnotationUtil {

	private static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			//create sessonFactory from hibernate-annotation.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate-annotation.cfg.xml");
			
			System.out.println("Hibernate Annotation Configuration loaded");
			
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			
		     return sessionFactory;
			     
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed" + ex);
			  ex.printStackTrace();
			  throw new ExceptionInInitializerError(ex);
		}
	}
	
	// we are going to use this one with hibernate
	// this creates the hibernate  sessionFactory using the configuration file
	// that was saved to the classpath.
	private static Session getCurrentSessionFromConfig() {
		
		try {
			//create sessonFactory from hibernate-annotation.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			
			System.out.println("Hibernate Annotation Configuration loaded");
			
			// local sessionfactory bean created
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			     return session;
			     
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed" + ex);
			  ex.printStackTrace();
			  throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null)sessionFactory = buildSessionFactory();
		    return sessionFactory;
	}
}
