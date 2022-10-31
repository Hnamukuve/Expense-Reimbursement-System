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
import reimbursements.Reimb;

public class UserDAO implements DAO<Users>{

	 private List<Users> users = new ArrayList<>();
	    
	    public UserDAO() {
	        users.add(new Users(6, "Rachael", "password9910", "Rachael", "Borris", "borris@gmail.com", 15));
	        users.add(new Users(7, "Joel", "plc390fgtty", "Joel", "Kippler", "joekippler@gmail.com", 10));
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

		@Override
		public void update(Users user) {
			// TODO Auto-generated method stub
			
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

		public static void read(Connection conn) {
			System.out.println("Now reading the DB!!!");
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
		
		 private List<Users> mapResultSet(ResultSet rs) throws SQLException {
		        
		        List<Users> users = new ArrayList<>();
		        
		        while (rs.next()) {
		        	
		            Users user = new Users();
		            user.setId(rs.getInt("ers_users_id"));
		            user.setUsername(rs.getString("ers_username"));
		            user.setEmail(rs.getString("user_email"));
		            user.setPassword(rs.getString("ers_password"));
		            user.setFirstName(rs.getString("user_first_name"));
		            user.setLastName(rs.getString("user_last_name"));
		            user.setUserRoleId(rs.getInt("user_role_id"));
		           
		            users.add(user);
		        }

		        return users;
		    }
		
		
		public static void delete(List<Users> usersList, Connection conn) {
			
			try {
				
			String query = "DELETE FROM USERS WHERE ID = ?";
			
			PreparedStatement deleteUsers = conn.prepareStatement(query);
			
			for(Users users : usersList) {
			deleteUsers.setInt(3,users.getId());
			}
			System.out.println("Record Successfully deleted");
			
		} catch (SQLException e) {
			System.out.println("Delete failed");
			e.printStackTrace();
		}
		

		}

		public List<Users> getAllUsers() {
			
			return null;
		}

		public Object findUserByUsername(String username) {
			
			return username;
		}

		public Object findUserById(String id) {
			
			return id;
		}	
		
	
}
