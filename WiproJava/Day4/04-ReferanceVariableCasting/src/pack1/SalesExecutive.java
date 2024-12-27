package pack1;

public class SalesExecutive extends Employee{
	public double salesAchieved=5000.00;
	
	@Override
	public double getNetSalary() {
		return basicSalary+(basicSalary*0.10)+(salesAchieved*0.15);
	}
	
	public double getSalesAchieved() {
		return this.salesAchieved;
	}

}
