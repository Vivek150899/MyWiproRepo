
public class Employee {

	private double basicSalary;

	double getBasicSalary() {
		return basicSalary;
	}

	void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	double getNetSalary() {
		double net=0;
		double allowance=this.basicSalary*0.35;
		double tax=basicSalary*0.10;
		net=this.basicSalary+allowance-tax;
		return net;
	}
	double getNetSalary(double incentive) {
		double net=0;
		double allowance=this.basicSalary*0.35;
		double tax=basicSalary*0.10;
		net=this.basicSalary+allowance-tax+incentive;
		return net;
	}
	double getNetSalary(int extraHours,double incentive) {
		double net=0;
		double allowance=this.basicSalary*0.35;
		double tax=basicSalary*0.10;
		double extraPayment=extraHours*100;
		net=this.basicSalary+allowance-tax+extraPayment;
		return net;
	}
	double getNetSalary(int extraHours) {
		double net=0;
		double allowance=this.basicSalary*0.35;
		double tax=basicSalary*0.10;
		double extraPayment=extraHours*100;
		net=this.basicSalary+allowance-tax+extraPayment;
		return net;
	}
}
