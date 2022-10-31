package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	 private final String url = "jdbc:postgresql://127.0.0.1:5432/employeedb";
	    private final String user = "postgres";
	    private final String password = "Nsereko82%";

	    public Connection connect() {
	        Connection conn = null;
	        try {
	            Class.forName("org.postgresql.Driver");
	            conn = DriverManager.getConnection(url, user, password);
	            if(conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");

	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());

	        } catch (ClassNotFoundException e) {
	            throw new RuntimeException(e);
	        }
			return conn;
	   
	    }
	    
	
}
