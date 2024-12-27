package pack1;

public abstract class Loan {
	private double loanAmount;
	private int tenure;
	
	
	
	public Loan(double loanAmount, int tenure) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}
	
	public Loan() {
		super();
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public abstract double getInterestRate();
	
	public double getInterestAmount() {
		return this.loanAmount*this.tenure*this.getInterestRate();
	}
	
	public double getRepayableAmount() {
		return this.loanAmount+this.getInterestAmount();
	}
	public double getEMI() {
		return this.getRepayableAmount()/this.tenure;
	}
	

}
