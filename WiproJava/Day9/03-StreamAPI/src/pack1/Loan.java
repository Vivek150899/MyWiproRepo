
package pack1;

import java.util.Comparator;
import java.util.Objects;

public class Loan implements Comparable<Loan>{
	int loanId;
	String customerName;
	double loanAmt;
	int tenure;
	public Loan(int loanId, String customerName, double loanAmt, int tenure) {
		super();
		this.loanId = loanId;
		this.customerName = customerName;
		this.loanAmt = loanAmt;
		this.tenure = tenure;
	}
	public Loan() {
		super();
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, loanAmt, loanId, tenure);
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
		return Objects.equals(customerName, other.customerName)
				&& Double.doubleToLongBits(loanAmt) == Double.doubleToLongBits(other.loanAmt) && loanId == other.loanId
				&& tenure == other.tenure;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerName=" + customerName + ", loanAmt=" + loanAmt + ", tenure="
				+ tenure + "]";
	}
	@Override
	public int compareTo(Loan o) {
		// TODO Auto-generated method stub
		return this.tenure-o.tenure;
	}
	
	
	
	

}
