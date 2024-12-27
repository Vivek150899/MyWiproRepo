
public class Loan {
	
	
	
	String customerName;
	double loanAmount;
	float interestRate;
	int duration;
	
	
	
	Loan(String customerName, double loanAmount, float interestRate, int duration) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.duration = duration;
	}
	Loan() {
		super();
	}
	String getCustomerName() {
		return customerName;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	double getLoanAmount() {
		return loanAmount;
	}
	void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	float getInterestRate() {
		return interestRate;
	}
	void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	int getDuration() {
		return duration;
	}
	void setDuration(int duration) {
		this.duration = duration;
	}
	
	double computeInterst() {
		return this.loanAmount*this.duration*this.interestRate;
	}
	   

}
