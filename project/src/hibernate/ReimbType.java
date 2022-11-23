package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReimbType {

	@Id
	@Column(name = "reimb_type_id")
	private int reimbTypeId;
	
	@Column(name = "reimb_type")
	private int reimbType;

	

	public int getReimbTypeId() {
		return reimbTypeId;
	}

	public void setReimbTypeId(int reimbTypeId) {
		this.reimbTypeId = reimbTypeId;
	}

	public int getReimbType() {
		return reimbType;
	}

	public void setReimbType(int reimbType) {
		this.reimbType = reimbType;
	}

	public ReimbType(int id, int reimbType) {
		super();
		this.reimbTypeId = reimbTypeId;
		this.reimbType = reimbType;
	}

	public ReimbType() {
		super();
		
	}

	@Override
	public String toString() {
		return "ReimbType [id=" + reimbTypeId + ", reimbType=" + reimbType + "]";
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
	
	
}
