package pack1;

public class PersonalLoan extends Loan{
	
	private String phoneNumber;
	
		public PersonalLoan(double loanAmount, int tenure, String phoneNumber) {
		super(loanAmount, tenure);
		this.phoneNumber = phoneNumber;
	}
	
	public PersonalLoan(double loanAmount, int tenure) {
		super(loanAmount, tenure);
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public  double getInterestRate() {
		return 0.15;
	}
	

}
