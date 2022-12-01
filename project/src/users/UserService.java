package users;

import java.util.List;

public class UserService {
	
	private UserDAO ud;
	
	//services or features offered in the application
	
	// When a user logs in
	// check to make sure that the credentials exists in the db
	// this method will validate that the user exists in the database
	public Boolean confirmLogin(String username, String password) {
		ud = new UserDAO();
		Users user = null;
		
		if((user=ud.findUserByUsername(username)) != null) {
			
			// if we get here then the username exists in the users table
			// next we need to check the password
			
			if(user.getPassword().equals(password)) {
				// if we get here than the username and password that was typed in is correct
				return true; // allows the user to log in
			}
		}
		return false;
	}
	
	
	// register a user
	// this method takes the users information and sends it to the dao layer to be added to the db
	
	public Boolean registerUser(Users user) {
		ud = new UserDAO();
		if(ud.insertUser(user)) {
			return true;
		}
		return false;
	}
	
	
	// update my info
	// this method allows the user to update their information on their account
	
	public Boolean updateUserEmail(String email) {
		ud = new UserDAO();
		Users user = null;
		user = ud.findUserByEmail(email);
		//update the email address
		user.setEmail(email);
		//save user with new email
		if (ud.updateUser(user)) {
			return true;
		}
		
		return false;
	}
	
	public Boolean updateUsername(String username) {
		
		ud = new UserDAO();
		Users user = null;
		user = ud.findUserByUsername(username);
		user.setUsername(username);
		if(ud.updateUser(user)) {
			return true;
	}
		
		return null;
		
	}
	
    public List<Users> getAllUsers() {
		
		List<Users> user = ud.getAll();
		return user;  
	}

	   
}
