package pack1;

import java.util.Objects;

public class Loan {
	private int loanID;
	private int loanAmount;
	public Loan(int loanID, int loanAmount) {
		super();
		this.loanID = loanID;
		this.loanAmount = loanAmount;
	}
	
	public Loan() {
		super();
	}
	
	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [getLoanID()=" + getLoanID() + ", getLoanAmount()=" + getLoanAmount() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(loanAmount, loanID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		return loanAmount == other.loanAmount && loanID == other.loanID;
	}
	

}
