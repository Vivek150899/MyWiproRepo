package pack1;

public class CarLoan extends Loan{
	
	private String regNumber;
	
	
	public CarLoan(double loanAmount, int tenure, String regNumber) {
		super(loanAmount, tenure);
		this.regNumber = regNumber;
	}
	


	public CarLoan(double loanAmount, int tenure) {
		super(loanAmount, tenure);
	}
	



	public String getRegNumber() {
		return regNumber;
	}



	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}



	@Override
	public  double getInterestRate() {
		return 0.08;
	}

}
