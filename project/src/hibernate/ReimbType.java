package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReimbType {

	@Id
	@Column(name = "reimb_type_id")
	private int id;
	
	@Column(name = "reimb_type")
	private int reimbType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReimbType() {
		return reimbType;
	}

	public void setReimbType(int reimbType) {
		this.reimbType = reimbType;
	}

	public ReimbType(int id, int reimbType) {
		super();
		this.id = id;
		this.reimbType = reimbType;
	}

	public ReimbType() {
		super();
		
	}

	@Override
	public String toString() {
		return "ReimbType [id=" + id + ", reimbType=" + reimbType + "]";
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
