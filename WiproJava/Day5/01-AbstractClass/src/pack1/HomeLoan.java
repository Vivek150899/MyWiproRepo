package pack1;

public class HomeLoan extends Loan{
	
	private String propertyLocation;
	
	
	public HomeLoan(double loanAmount, int tenure, String propertyLocation) {
		super(loanAmount, tenure);
		this.propertyLocation = propertyLocation;
	}
    

	public HomeLoan(double loanAmount, int tenure) {
		super(loanAmount, tenure);
	}
    

	public String getPropertyLocation() {
		return propertyLocation;
	}


	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}


	@Override
	public  double getInterestRate() {
		return 0.07;
	}

}
