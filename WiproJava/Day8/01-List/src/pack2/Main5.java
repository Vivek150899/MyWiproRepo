package pack2;
import java.util.LinkedList;
import java.util.List;


import pack1.Employee;

public class Main5 {

	public static void main(String[] args) {
		// list of employee objects 5 print the name of employee and salary
		//compute the total salary of all employees
		List<Employee>employeeList;
		employeeList=new LinkedList<>();
		
		Employee employee1=new Employee(1,"Achal",1200.0);
		Employee employee2=new Employee(2,"Arpit",1300.0);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(new Employee(3,"Abhishek",1400.0));
		employeeList.add(new Employee(4,"Aman",1500.0));
		employeeList.add(new Employee(5,"Sunil",1600.0));
		
		System.out.println(employeeList);
		
		double total=0;
		
		for (Employee emp:employeeList) {
			System.out.println("Name of employee : "+emp.getName());
			System.out.println("Basic Salary of employee : "+emp.getBasic());
			System.out.println( "Net Salary of employee : "+emp.getNetSalary());
			total+=emp.getNetSalary();
			
		}
		
		System.out.println("Total net Salary of all Employees is: "+total);

	}

}
