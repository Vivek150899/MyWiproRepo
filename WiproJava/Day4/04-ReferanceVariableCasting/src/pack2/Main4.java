package pack2;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesExecutive;
public class Main4 {

	
	static void print(Employee e) {
		System.out.println(e.getNetSalary());
		if (e instanceof Manager) {
			Manager temp=(Manager) e;
			System.out.println("Manager Manages : "+temp.getEmployeeCount()+" Employees");
		}
		if (e instanceof SalesExecutive) {
			SalesExecutive temp=(SalesExecutive) e;
			System.out.println("Sales Executive Achievement : "+temp.getSalesAchieved());
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.basicSalary=1000.00;
		print(emp);
		
		emp=new Manager();
		emp.basicSalary=2000.00;
		print(emp);
		
		emp=new SalesExecutive();
		emp.basicSalary=1500.00;
		print(emp);
		

	}

}
