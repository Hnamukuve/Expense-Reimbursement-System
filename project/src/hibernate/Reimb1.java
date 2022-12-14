package hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name = "ers_reimbursement")
@SecondaryTable(name = "ers_reimb_status, ers_reimb_type")
public class Reimb1 {

	@Id
	//TODO add generation type
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_id")
	private int reimbid;
	
	@Column(name = "reimb_amount")
	private float reimbAmount;
	
	@Column(name = "reimb_resolved")
	private Timestamp reimbResolved;
	
	@Column(name = "reimb_submitted")
	private Timestamp reimbSubmitted;
	
	@Column(name = "reimb_description")
	private String reimbDescription;
	
	@Column(name = "reimb_author")
	private int reimbAuthor;
	
	@Column(name = "reimb_resolver")
	private int reimbResolver;
	
	@Column(name = "reimb_status_id", table = "ers_reimb_status")
	private int reimbStatusId;
	
	@Column(name = "reimb_type_id", table = "ers_reimb_type")
	private int reimbTypeId;

	public int getReimbid() {
		return reimbid;
	}

	public void setReimbid(int reimbId) {
		this.reimbid = reimbId;
	}

	public float getReimbAmount() {
		return reimbAmount;
	}

	public void setReimbAmount(float reimbAmount) {
		this.reimbAmount = reimbAmount;
	}

	public Timestamp getReimbResolved() {
		return reimbResolved;
	}

	public void setReimbResolved(Timestamp reimbResolved) {
		this.reimbResolved = reimbResolved;
	}

	public Timestamp getReimbSubmitted() {
		return reimbSubmitted;
	}

	public void setReimbSubmitted(Timestamp reimbSubmitted) {
		this.reimbSubmitted = reimbSubmitted;
	}

	public String getReimbDescription() {
		return reimbDescription;
	}

	public void setReimbDescription(String reimbDescription) {
		this.reimbDescription = reimbDescription;
	}

	public int getReimbAuthor() {
		return reimbAuthor;
	}

	public void setReimbAuthor(int reimbAuthor) {
		this.reimbAuthor = reimbAuthor;
	}

	public int getReimbResolver() {
		return reimbResolver;
	}

	public void setReimbResolver(int reimbResolver) {
		this.reimbResolver = reimbResolver;
	}

	public int getReimbStatusId() {
		return reimbStatusId;
	}

	public void setReimbStatusId(int reimbStatusId) {
		this.reimbStatusId = reimbStatusId;
	}

	public int getReimbTypeId() {
		return reimbTypeId;
	}

	public void setReimbTypeId(int reimbTypeId) {
		this.reimbTypeId = reimbTypeId;
	}

	
}
