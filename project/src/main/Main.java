//package main;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//
//import connection.ConnectionFactory;
//import reimbursements.Reimb;
//import reimbursements.ReimbDAO;
//import users.DAO;
//import users.UserDAO;
//import users.UserService;
//import users.Users;
////import org.hibernate.HibernateException;
//
//public class Main {
//
//	
//	public static void main(String[] args) {
//		
//		 ConnectionFactory connFactory  = new ConnectionFactory();
//	     Connection conn = connFactory.connect();
	   
	     
//		we want to use this to initialize our entities

	     
	     //persist or add these users into the db
	     // first we call the DAO class 
	     // then the crud method
	     //UserDAO.create(usersList, conn);
	     
	     // TODO update an existing record (either 1 or multiple records)
	     //UserDAO.update(usersList, conn);
	     
	     //UserDAO.delete(usersList, conn);
	     
	     // get all records
	     //UserDAO.read(conn);
	    
	     
//	     
//    List<Reimb> reimbList = new ArrayList<>();
//	     
//	      
//         ReimbDAO.create(reimbList, conn);
//	     ReimbDAO.update(reimbList, conn);
//	     ReimbDAO.read(conn);
//	     ReimbDAO.delete(reimbList, conn);
//
//	}
//	
//}
