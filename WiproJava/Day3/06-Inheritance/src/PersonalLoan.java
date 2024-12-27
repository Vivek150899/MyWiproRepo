
public class PersonalLoan extends Loan{
       private double minLimit,maxLimit;

	PersonalLoan(String customerName, double loanAmount, float interestRate, int duration, double minLimit,
			double maxLimit) {
		super(customerName, loanAmount, interestRate, duration);
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
	}

	PersonalLoan() {
		super();
	}

	double getMinLimit() {
		return minLimit;
	}

	void setMinLimit(double minLimit) {
		this.minLimit = minLimit;
	}

	double getMaxLimit() {
		return maxLimit;
	}

	void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}     
}
