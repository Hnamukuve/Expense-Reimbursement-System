package users;

import java.io.Serializable;

public class UserResponse implements Serializable {

	 private String ers_user_id;
	    private String ers_username;
	    private String user_email;
	    private String ers_password;
	    private String user_first_name;
	    private String user_last_name;
	    private int user_role_id;
		public String getErs_user_id() {
			return ers_user_id;
		}
		public void setErs_user_id(String ers_user_id) {
			this.ers_user_id = ers_user_id;
		}
		public String getErs_username() {
			return ers_username;
		}
		public void setErs_username(String ers_username) {
			this.ers_username = ers_username;
		}
		public String getUser_email() {
			return user_email;
		}
		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}
		public String getErs_password() {
			return ers_password;
		}
		public void setErs_password(String ers_password) {
			this.ers_password = ers_password;
		}
		public String getUser_first_name() {
			return user_first_name;
		}
		public void setUser_first_name(String user_first_name) {
			this.user_first_name = user_first_name;
		}
		public String getUser_last_name() {
			return user_last_name;
		}
		public void setUser_last_name(String user_last_name) {
			this.user_last_name = user_last_name;
		}
		public int getUser_role_id() {
			return user_role_id;
		}
		public void setUser_role_id(int user_role_id) {
			this.user_role_id = user_role_id;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		
		@Override
		public String toString() {
		
			return super.toString();
		}
		public UserResponse(String ers_user_id, String ers_username, String user_email, String ers_password,
				String user_first_name, String user_last_name, int user_role_id) {
			super();
			this.ers_user_id = ers_user_id;
			this.ers_username = ers_username;
			this.user_email = user_email;
			this.ers_password = ers_password;
			this.user_first_name = user_first_name;
			this.user_last_name = user_last_name;
			this.user_role_id = user_role_id;
		}
		public UserResponse() {
			super();
			
		}
		
		
		
	    
	    
}
