package reimbursements;

import java.util.List;

import users.Users;


public class ReimbService {

	private  ReimbDAO rd;
	
	
	public Boolean create(Reimb reimb) {
    
		rd = new ReimbDAO();
		if(rd.createReimb(reimb)) {
			return true;
		}
		return false;
	}
	
	public  void updateReimb(Reimb r) {
		try {
			rd.update(r);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public List<Reimb> getAllReimb() {
		
		List<Reimb> reimb = rd.getAllReimb();
		return reimb;  
	}
     
	public  List<Reimb> getUserReimbs(Users user) {
		List<Reimb> reimb = rd.findAllById(user.getId());
		return reimb;
	}
	
	
	public Boolean getReimbByStatusId(int status_id) {
		
		rd = new ReimbDAO();
		Reimb reimb = null;
		return null;
		
		
	}
	
	public void approveAllReimbursements(String username) {
	
		
	}
 

}
