package reimbursements;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reimb {
	
	private int reimbId;
	private float reimbAmount;
	private LocalDateTime reimbSubmitted;
	private LocalDateTime reimbResolved;
	private String reimbDescription;
	private int reimbAuthor;
	private int reimbResolver;
	private int reimbStatusId;
	private int reimbTypeId;
	
	
	public int getReimbId() {
		return reimbId;
	}
	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}
	public float getReimbAmount() {
		return reimbAmount;
	}
	public void setReimbAmount(float reimbAmount) {
		this.reimbAmount = reimbAmount;
	}
	public LocalDateTime getReimbSubmitted() {
		return reimbSubmitted;
	}
	public void setReimbSubmitted(LocalDateTime reimbSubmitted) {
		this.reimbSubmitted = reimbSubmitted;
	}
	public LocalDateTime getReimbResolved() {
		return reimbResolved;
	}
	public void setReimbResolved(LocalDateTime reimbResolved) {
		this.reimbResolved = reimbResolved;
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
	
	@Override
	public String toString() {
		return "Reimb [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", reimbSubmitted=" + reimbSubmitted
				+ ", reimbResolved=" + reimbResolved + ", reimbDescription=" + reimbDescription + ", reimbAuthor="
				+ reimbAuthor + ", reimbResolver=" + reimbResolver + ", reimbStatusId=" + reimbStatusId
				+ ", reimbTypeId=" + reimbTypeId + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(reimbAmount, reimbAuthor, reimbDescription, reimbId, reimbResolved, reimbResolver,
				reimbStatusId, reimbSubmitted, reimbTypeId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimb other = (Reimb) obj;
		return Objects.equals(reimbAmount, other.reimbAmount) && reimbAuthor == other.reimbAuthor
				&& Objects.equals(reimbDescription, other.reimbDescription) && Objects.equals(reimbId, other.reimbId)
				&& Objects.equals(reimbResolved, other.reimbResolved) && reimbResolver == other.reimbResolver
				&& Objects.equals(reimbStatusId, other.reimbStatusId)
				&& Objects.equals(reimbSubmitted, other.reimbSubmitted)
				&& Objects.equals(reimbTypeId, other.reimbTypeId);
	}
	
	
	public Reimb(int reimbId, float reimbAmount, LocalDateTime reimbSubmitted, LocalDateTime reimbResolved,
			String reimbDescription, int reimbAuthor, int reimbResolver, int reimbStatusId, int reimbTypeId) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDescription = reimbDescription;
		this.reimbAuthor = reimbAuthor;
		this.reimbResolver = reimbResolver;
		this.reimbStatusId = reimbStatusId;
		this.reimbTypeId = reimbTypeId;
	}
	public Reimb(int i, double d, int j, int k, String string, int l, int m, int n) {
		// TODO Auto-generated constructor stub
	}
	public Reimb(int i, double d, int j, String string, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}
	
	

}
