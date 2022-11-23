package hibernate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReimbStatus {

	@Id
	@Column(name = "reimb_status_id")
	private int reimbStatusId;
	
	@Column(name = "reimb_status")
	private int reimbStatus;

	public int getReimbStatusId() {
		return reimbStatusId;
	}

	public void setReimbStatusId(int reimbStatusId) {
		this.reimbStatusId = reimbStatusId;
	}

	public int getReimbStatus() {
		return reimbStatus;
	}

	public void setReimbStatus(int reimbStatus) {
		this.reimbStatus = reimbStatus;
	}

	@Override
	public String toString() {
		return "ReimbStatus [id=" + reimbStatusId + ", reimbStatus=" + reimbStatus + "]";
	}

	public ReimbStatus(int id, int reimbStatus) {
		super();
		this.reimbStatusId = reimbStatusId;
		this.reimbStatus = reimbStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reimbStatusId, reimbStatus);
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
		return reimbStatusId == other.reimbStatusId && reimbStatus == other.reimbStatus;
	}

	public ReimbStatus() {
		super();
		
	}
	
	
}
