package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

	//private static SessionFactory factory; 
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		((AnnotationConfiguration) configuration).addAnnotatedClass(Users1.class);
		//create Session factory
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//this does all of the above in one line of code:
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		//initialize Session object
		Session session = sessionFactory.openSession();
		
//		Users1 users = new Users1();
//		users.setId(6);
//		users.setUsername("Sanz");
//		users.setFirstName("Dolores");
//		users.setLastName("Sanchez");
//		users.setEmail("donsanchez@yahoo.com");
//		users.setPassword("167gh540zl");
//		users.setUserRoleId(10);
//		
//		Users1 users1 = new Users1();
//		session.beginTransaction();
//		
//		//save method of JPA used
//		session.save(users1);
//		
//		session.getTransaction().commit();
//		
//		Reimb1 reimb = new Reimb1();
//		reimb.setReimbid(40);
//		reimb.setReimbSubmitted(null);
//		reimb.setReimbResolved(null);
//		reimb.setReimbAuthor(70);
//		reimb.setReimbAmount(156);
//		reimb.setReimbResolver(100);
//		reimb.setReimbStatusId(400);
//		reimb.setReimbTypeId(200);
//		reimb.setReimbDescription("Accommodation");
//		
//		ReimbStatus reimbStatus = new ReimbStatus();
//		ReimbType reimbType = new ReimbType();
//		UserRoles userRoles = new UserRoles(0, null);
//		
//		SessionFactory sessionFactory1 = null;
//		Session session1 = null;
//		Transaction tx = null;
		try{
//		//Get Session
////		sessionFactory1 = HibernateAnnotationUtil.getSessionFactory();
//		session1 = sessionFactory1.getCurrentSession();
//		System.out.println("Session created");
//		//start transaction
//		tx = session1.beginTransaction();
//		//Save the Model object
//		session1.save(users1);
//		
		
		
		}catch(Exception e){
			System.out.println("Exception occured. "+e.getMessage());
			e.printStackTrace();
		}finally{
//			if(!sessionFactory1.isClosed()){
//				System.out.println("Closing SessionFactory");
//				sessionFactory1.close();
//			}
		}
	 

		
		   }
}
