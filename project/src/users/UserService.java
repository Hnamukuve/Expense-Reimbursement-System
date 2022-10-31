package users;

import java.util.ArrayList;
import java.util.List;

import reimbursements.Reimb;

public class UserService {

	 private final UserDAO userDAO;

	    public UserService(UserDAO userDAO) {
	        this.userDAO = userDAO;
	    }
	    
	    public List<UserResponse> getAllUsers() {

	        
	        List<UserResponse> result = new ArrayList<>();
	        List<Users> users = userDAO.getAllUsers();
	        

	        for (Users user : users) {
	            result.add(new UserResponse());
	        }

	        return result;

	    }
	    
	   
}
