package pack1;

public class Employee {
	
	double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws Exception{
		if (basicSalary<0) {
		Exception re=new Exception("Invalid Basic salary : " + basicSalary);
		throw re;
		}
		this.basicSalary = basicSalary;
	}
	

}
