
public class Employee {
	
	private char grade;
	private double basicSalary;
	
	
	
	
	
	char getGrade() {
		return grade;
	}





	void setGrade(char grade) {
		if (grade=='A' || grade=='B')
		    this.grade = grade;
		else
			System.out.println("Invalid Grade");
	}





	double getBasicSalary() {
		return basicSalary;
	}





	void setBasicSalary(double basicSalary) {
		if (basicSalary<0)
			System.out.println("Invalid Basic Salary");
		else
			this.basicSalary = basicSalary;
	}





	double calculateAllowance() {
		double allowance;
		switch(grade) {
		case 'A': 
			allowance=basicSalary*.35;
			break;
		case 'B': 
			allowance=basicSalary*.25;
			break;
		case 'C': 
			allowance=basicSalary*.15;
			break;
		default:
			allowance=0;
		}
		return allowance;
	}
	

}
