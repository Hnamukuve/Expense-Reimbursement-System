package reimbursements;

import java.util.ArrayList;
import java.util.List;


public class ReimbService {

	private final ReimbDAO reimbDAO;
	
    public ReimbService(ReimbDAO reimbDAO) {
        this.reimbDAO = reimbDAO;
    }
    
    public List<ReimbResponse> getAllReimb() {

        
        List<ReimbResponse> result = new ArrayList<>();
        List<Reimb> reimb = reimbDAO.getAllReimb();

        for (Reimb reimbs : reimb) {
            result.add(new ReimbResponse());
        }

        return result;

    }
}
