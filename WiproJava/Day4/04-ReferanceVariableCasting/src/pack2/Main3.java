package pack2;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesExecutive;


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.basicSalary=1000.0;
		
		System.out.println(emp.getNetSalary());
		
		emp=new Manager();
		emp.basicSalary=2000.00;
		System.out.println(emp.getNetSalary());
		
		emp=new SalesExecutive();
		emp.basicSalary=2000.00;
		System.out.println(emp.getNetSalary());
		

	}

}
