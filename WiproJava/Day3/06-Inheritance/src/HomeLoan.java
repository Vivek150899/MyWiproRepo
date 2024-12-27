
public class HomeLoan extends Loan{
	private String propertyLocation;

	

	HomeLoan(String customerName, double loanAmount, float interestRate, int duration, String propertyLocation) {
		super(customerName, loanAmount, interestRate, duration);
		this.propertyLocation = propertyLocation;
	}

	HomeLoan() {
		super();
	}

	String getPropertyLocation() {
		return propertyLocation;
	}

	void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
    
}
