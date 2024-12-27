
public class Employee {
	
	char grade;
	double basicSalary;
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
