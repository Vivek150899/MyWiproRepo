package pack2;

import pack1.Employee;

public class Main2 {

	public static void main(String[] args) {
		
		Employee e;
		e=new Employee(1055,"Achal",10000.0,'A');
		
		System.out.println("Allowance : "+e.getAllowance());
		System.out.println("Deduction : "+e.getDeduction());
		System.out.println("Net Salary : "+e.getNetSalary());

	}

}
