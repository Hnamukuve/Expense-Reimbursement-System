package reimbursements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import users.DAO;
import users.Users;

public class ReimbDAO implements DAO<Reimb> {

	@Override
	public Optional<Reimb> get(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Reimb> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Reimb t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Reimb t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Reimb t) {
		// TODO Auto-generated method stub
		
	}
	
	
		public static void create(List<Reimb> reimbList, Connection conn) {
			try {
				String query = "INSERT INTO ERS_REIMBURSEMENT (reimb_id, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, reimb_resolver, reimb_status_id, reimb_type_id)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement createReimb = conn.prepareStatement(query);

				for (Reimb reimb : reimbList) {
					createReimb.setInt(1,reimb.getReimbId());
					createReimb.setFloat(2,reimb.getReimbAmount());
					createReimb.setTimestamp(3,Timestamp.valueOf(LocalDateTime.now()));
					createReimb.setTimestamp(4,Timestamp.valueOf(LocalDateTime.now()));
					createReimb.setString(5,reimb.getReimbDescription());
					createReimb.setInt(6,reimb.getReimbAuthor());
					createReimb.setInt(7,reimb.getReimbResolver());
					createReimb.setInt(8,reimb.getReimbStatusId());
					createReimb.setInt(9,reimb.getReimbTypeId());
					
					createReimb.addBatch();
				}
				
				createReimb.executeBatch();
				System.out.println("Reimb Sucessfully Created in the DB!");
				
			} catch (SQLException e) {
				System.out.println("Update failed!!!");
				e.printStackTrace();
			}
		}
		
		public static void read(Connection conn) {
			
			System.out.println("Reimb Now reading the DB!!!");
			
			try {
				String query = "SELECT * FROM  ERS_REIMBURSEMENT";
				
				Statement readReimb = conn.createStatement();
				ResultSet rs = readReimb.executeQuery(query);
				while(rs.next()) {
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getString(6));
					System.out.println(rs.getString(7));
					
				}
				System.out.println("Successfully queried the reimbursements in DB!");
				
			} catch (SQLException e) {
				System.out.println("Update failed!!!");
				e.printStackTrace();
			}
		}
	  
        public static void delete(List<Reimb> reimbList, Connection conn) {
			
			try {
				
			String query = "DELETE FROM ers_reimbursement WHERE ID = ?";
			
			PreparedStatement deleteReimb = conn.prepareStatement(query);
			for(Reimb reimb : reimbList) {
			deleteReimb.setInt(3,reimb.getReimbId());
			}
			System.out.println("Reimbursement Record Successfully deleted");
			
		} catch (SQLException e) {
			System.out.println("Delete failed");
			e.printStackTrace();
		}
		

		}

		public static void update(List<Reimb> reimbList, Connection conn) {
			
			try {
			     String qeury = "UPDATE ERS_REIMBURSEMENT";
			
			PreparedStatement updateReimb = conn.prepareStatement(qeury);
			
			for (Reimb reimb : reimbList) {
				updateReimb.setInt(1,reimb.getReimbId());
				updateReimb.setFloat(2,reimb.getReimbAmount());
				updateReimb.setTimestamp(3,Timestamp.valueOf(LocalDateTime.now()));
				updateReimb.setTimestamp(4,Timestamp.valueOf(LocalDateTime.now()));
				updateReimb.setString(5,reimb.getReimbDescription());
				updateReimb.setInt(6,reimb.getReimbAuthor());
				updateReimb.setInt(7,reimb.getReimbResolver());
				updateReimb.setInt(8,reimb.getReimbStatusId());
				updateReimb.setInt(9,reimb.getReimbTypeId());
				
				updateReimb.addBatch();	  
		         
		}
		
			updateReimb.executeBatch();
			System.out.println("Sucessfully Updated Reimbursements in the DB!");
			
		} catch (SQLException e) {
			System.out.println("Reimbursement Update failed!!!");
			e.printStackTrace();
		}
			
		}

		public List<Reimb> getAllReimb() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean createReimb(Reimb reimb) {
			
			return false;
		}

		public List<Reimb> findAllById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

}
