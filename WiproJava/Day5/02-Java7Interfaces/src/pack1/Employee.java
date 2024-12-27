package pack1;

public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private SalaryCalculation salaryCalculation;
	
	public Employee(int id, String name, double basicSalary, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.setGrade(grade);;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
		if (this.grade=='A')
			salaryCalculation=new AGradeSalaryCalculation();
		if (this.grade=='B')
			salaryCalculation=new BGradeSalaryCalculation();
		if (this.grade=='C')
			salaryCalculation=new CGradeSalaryCalculation();
	}
	
	public double getAllowance() {
		double a= salaryCalculation.computeAllowance(this.basicSalary);
		return a;
	}
	
	public double getDeduction() {
		double a=salaryCalculation.computeDeduction(this.basicSalary);
		return a;
	}
	
	public double getNetSalary() {
		double a=salaryCalculation.computeNetSalary(this.basicSalary);
		return a;
	}
	

}
