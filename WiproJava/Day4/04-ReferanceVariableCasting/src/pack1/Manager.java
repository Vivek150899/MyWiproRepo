package pack1;

public class Manager extends Employee{
	public int employeeCount=10;
	
	@Override
	public double getNetSalary() {
		return basicSalary+(basicSalary*0.10)+(employeeCount*100);
	}
	
	public int getEmployeeCount() {
		return this.employeeCount;
	}
	

}
