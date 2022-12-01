package users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import connection.ConnectionFactory;

public class UserDAO implements DAO<Users>{

	 private List<Users> users = new ArrayList<>();
	    
	    public UserDAO() {
	        //users.add(new Users(6, "Rachael", "password9910", "Rachael", "Borris", "borris@gmail.com", 15));
	        //users.add(new Users(7, "Joel", "plc390fgtty", "Joel", "Kippler", "joekippler@gmail.com", 10));
	    }

	    @Override
		public Optional get(long id) {
		
			return null;
		}

		@Override
		public void save(Users users) {
			
		}
		
		@Override
		public List<Users> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
		public static void update(List<Users> usersList, Connection conn) {
		
			try {
			     String qeury = "UPDATE ERS_USERS";
			
			PreparedStatement updateUsers = conn.prepareStatement(qeury);
			
			for (Users user : usersList) {
				updateUsers.setString(1,user.getEmail());
				updateUsers.setString(2,user.getFirstName());
				updateUsers.setInt(3,user.getId());
				updateUsers.setString(4,user.getLastName());
				updateUsers.setString(5,user.getPassword());
				updateUsers.setInt(6,user.getUserRoleId());
				updateUsers.setString(7,user.getUsername());
				
				updateUsers.addBatch();	  
		         
		}
		
			updateUsers.executeBatch();
			System.out.println("Sucessfully Updated in the DB!");
			
		} catch (SQLException e) {
			System.out.println("Update failed!!!");
			e.printStackTrace();
		}
	}

		@Override
		public void delete(Users users){
			
			
		}

		public static void create(List<Users> usersList, Connection conn) {
			
			try {
				
				String query = "INSERT INTO ERS_USERS (user_email, user_first_name, ers_users_id, user_last_name, ers_password, ers_user_role_id, ers_username)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement createUsers = conn.prepareStatement(query);

				for (Users user : usersList) {
					createUsers.setString(1,user.getEmail());
					createUsers.setString(2,user.getFirstName());
					createUsers.setInt(3,user.getId());
					createUsers.setString(4,user.getLastName());
					createUsers.setString(5,user.getPassword());
					createUsers.setInt(6,user.getUserRoleId());
					createUsers.setString(7,user.getUsername());
					// add records to batch so values dont get overridden
					createUsers.addBatch();
				}
				// execute batches in one go
				createUsers.executeBatch();
				System.out.println("Sucessfully Updated the DB!");
				
			} catch (SQLException e) {
				System.out.println("Update failed!!!");
				e.printStackTrace();
			}
		}

		public boolean insertUser(Users user) {
			try {
				String query = "INSERT INTO ERS_USERS (user_email, user_first_name, ers_users_id, user_last_name, ers_password, ers_user_role_id, ers_username)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
				ConnectionFactory connFactory = new ConnectionFactory();
				Connection conn = connFactory.connect();
				PreparedStatement createUsers = conn.prepareStatement(query);

				createUsers.setString(1, user.getEmail());
				createUsers.setString(2, user.getFirstName());
				createUsers.setInt(3, user.getId());
				createUsers.setString(4, user.getLastName());
				createUsers.setString(5, user.getPassword());
				createUsers.setInt(6, user.getUserRoleId());
				createUsers.setString(7, user.getUsername());

				createUsers.execute();
				System.out.println("Sucessfully registered the user account!");
				return true;
				
			} catch (SQLException e) {
				System.out.println("Update failed!!!");
				e.printStackTrace();
				return false;
			}
		}
		
            public boolean updateUserEmail(String email) {
			
            	Users user = new Users();
			// sql will look something like: UPDATE ERS_USERS SET EMAIL = 'NEW_EMAIL' WHERE ID = ?
			try {
				
				String query = "UPDATE ERS_USERS SET EMAIL = 'NEW_EMAIL' WHERE ID = ?";
				ConnectionFactory connFactory = new ConnectionFactory();
				Connection conn = connFactory.connect();
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery(query);
				
				
				// TODO updates do not return results. remove result set.
				while(rs.next()) {
					
					user.setEmail(rs.getString(1));
					user.setFirstName(rs.getString(2));
					user.setId(rs.getInt(3));
					user.setLastName(rs.getString(4));
					user.setPassword(rs.getString(5));
					user.setUserRoleId(rs.getInt(6));
					user.setUsername(rs.getString(7));
				}
				System.out.println("Sucessfully updated email in the DB!");
				return true;
				
			} catch (SQLException e) {
				System.out.println("Email Update failed!!!");
				e.printStackTrace();
			return false;
		}	
			
			
		}
			
		
		
		public static void read(Connection conn) {
			
			
			try {
				String query = "SELECT * FROM  ERS_USERS";
				
				Statement readUsers = conn.createStatement();
				ResultSet rs = readUsers.executeQuery(query);
				while(rs.next()) {
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getString(6));
					System.out.println(rs.getString(7));
				}
				System.out.println("Sucessfully queried the DB!");
				
			} catch (SQLException e) {
				System.out.println("User Update failed!!!");
				e.printStackTrace();
			}
		}
		
		
		// TODO this method doesnt work. where is the query being executed?
//		public static void delete(List<Users> usersList, Connection conn) {
//			
//			try {
//				
//			String query = "DELETE FROM USERS WHERE ID = ?";
//			
//			PreparedStatement deleteUsers = conn.prepareStatement(query);
//			
//			for(Users users : usersList) {
//			deleteUsers.setInt(3,users.getId());
//			}
//			System.out.println("Record Successfully deleted");
//			
//		} catch (SQLException e) {
//			System.out.println("Delete failed");
//			e.printStackTrace();
//		}
//		
//
//		}

		public List<Users> getAllUsers() {
			
			return null;
		}

		// TODO this needs to return a Users object
		// need to actually query the database and return the record with all the users information

		public Users findUserByUsername(String username) {
			// get user details based on a username
			Users user = new Users();
			user.setUsername(username);
			return user;
		}

		
		public Object findUserById(int id) {
			
			Users user = null;
			
			try {
				
				String query = "SELECT * FROM  ERS_USERS WHERE ers_users_id = ?";
				ConnectionFactory connFactory = new ConnectionFactory();
				Connection conn = connFactory.connect();
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery(query);
				
				while(rs.next()) {
					
					user.setEmail(rs.getString(1));
					user.setFirstName(rs.getString(2));
					user.setId(rs.getInt(3));
					user.setLastName(rs.getString(4));
					user.setPassword(rs.getString(5));
					user.setUserRoleId(rs.getInt(6));
					user.setUsername(rs.getString(7));
				}
				System.out.println("Sucessfully queried the DB!");
				
			} catch (SQLException e) {
				System.out.println("User Update failed!!!");
				e.printStackTrace();
				return null;
			}
			return user;
		}
		

		public Users findUserByEmail(String email) {
			
			//Users user = null;
			Users user = new Users();
			
			try {
				
				String query = "SELECT * FROM  ERS_USERS WHERE user_email = ?";
				ConnectionFactory connFactory = new ConnectionFactory();
				Connection conn = connFactory.connect();
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, email);
				ResultSet rs = ps.executeQuery(query);
				
				while(rs.next()) {
					
					user.setEmail(email);
					user.setFirstName(rs.getString(2));
					user.setId(rs.getInt(3));
					user.setLastName(rs.getString(4));
					user.setPassword(rs.getString(5));
					user.setUserRoleId(rs.getInt(6));
					user.setUsername(rs.getString(7));
				}
				System.out.println("Sucessfully queried the DB!");
				
			} catch (SQLException e) {
				System.out.println("User Update failed!!!");
				e.printStackTrace();
				return null;
			}
			return user;
		}
		
		// TODO in real life, you wouldnt do this query because multiple users can have
		// the same password and returning another user with the same password is a
		// security issue. need to fix/find alternative.
//		public Users findUserByUsername(String username) {
//	
//			//Users user = null;
//			Users user = new Users();
//			
//			try {
//				
//				String query = "SELECT * FROM  ERS_USERS WHERE ers_username = ?";
//				ConnectionFactory connFactory = new ConnectionFactory();
//				Connection conn = connFactory.connect();
//				PreparedStatement ps = conn.prepareStatement(query);
//				ps.setString(1, username);
//				ResultSet rs = ps.executeQuery(query);
//				
//				while(rs.next()) {
//					
//					user.setEmail(rs.getString(1));
//					user.setFirstName(rs.getString(2));
//					user.setId(rs.getInt(3));
//					user.setLastName(rs.getString(4));
//					user.setPassword(password);
//					user.setUserRoleId(rs.getInt(6));
//					user.setUsername(rs.getString(7));
//				}
//				System.out.println("Sucessfully queried the DB!");
//				
//			} catch (SQLException e) {
//				System.out.println("User Update failed!!!");
//				e.printStackTrace();
//			return null;
//		}	
//			return user;
//			
//		}

		public boolean updateUser(Users user) {
			// TODO implement?
			return false;
		}

		@Override
		public void update(Users t) {
			// TODO implement?
			
		}

		
//		public boolean updateUsers(Users user) {
//			// TODO implement?
//			return false;
//		}
		
	
}
