package hibernate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReimbStatus {

	@Id
	@Column(name = "reimb_status_id")
	private int id;
	
	@Column(name = "reimb_status")
	private int reimbStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReimbStatus() {
		return reimbStatus;
	}

	public void setReimbStatus(int reimbStatus) {
		this.reimbStatus = reimbStatus;
	}

	@Override
	public String toString() {
		return "ReimbStatus [id=" + id + ", reimbStatus=" + reimbStatus + "]";
	}

	public ReimbStatus(int id, int reimbStatus) {
		super();
		this.id = id;
		this.reimbStatus = reimbStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, reimbStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbStatus other = (ReimbStatus) obj;
		return id == other.id && reimbStatus == other.reimbStatus;
	}

	public ReimbStatus() {
		super();
		
	}
	
	
}
