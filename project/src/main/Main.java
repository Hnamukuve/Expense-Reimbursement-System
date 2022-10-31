package main;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import reimbursements.Reimb;
import reimbursements.ReimbDAO;
import users.DAO;
import users.UserDAO;
import users.Users;


public class Main {

	public static void main(String[] args) {
		
		 ConnectionFactory connFactory  = new ConnectionFactory();
	     Connection conn = connFactory.connect();
	     
//		we want to use this to initialize our entities
//	     Users user = new Users();  
	     
	     //Users user1 = new Users(5, "Duke", "password1888", "Duncan", "George", "dukegeorge@gmail.com", 15);
	     //Users user2 = new Users(6, "Rosette", "wgz74##p1", "Rosette", "Robinson", "robin@gmail.com", 10);
	
	     
	     List<Users> usersList = new ArrayList<>();
	     //usersList.add(user1);
	     //usersList.add(user2);
	     
	     //persist or add these users into the db
	     // first we call the DAO class 
	     // then the crud method
	     UserDAO.create(usersList, conn);
	     
	     // TODO update an existing record (either 1 or multiple records)
	     UserDAO.update(usersList, conn);
	     
	     UserDAO.delete(usersList, conn);
	     
	     // get all records
	     UserDAO.read(conn);
	     
	     List<Reimb> reimbList = new ArrayList<>();
	     
	     
	     ReimbDAO.create(reimbList, conn);
	     ReimbDAO.update(reimbList, conn);
	     ReimbDAO.read(conn);
	     ReimbDAO.delete(reimbList, conn);
	}

}
