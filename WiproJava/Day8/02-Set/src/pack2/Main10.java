package pack2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import pack1.Employee;
import pack1.EmployeeIdAscendingComperator;
import pack1.NameAscendingComparator;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee>employeeSet;
		
		
		
		Comparator<Employee>cr=new NameAscendingComparator();
		Comparator<Employee>cr1=new EmployeeIdAscendingComperator();
		employeeSet=new TreeSet<>(cr);
		
		employeeSet.add(new Employee(101,"Ram",200));
		employeeSet.add(new Employee(102,"Nirmal",100));
		employeeSet.add(new Employee(104,"Kunal",300));
		
		for (Employee emp:employeeSet) {
			System.out.println(emp);
		}
		
		employeeSet=new TreeSet<>(cr1);
		employeeSet.add(new Employee(101,"Ram",200));
		employeeSet.add(new Employee(102,"Rajesh",100));
		employeeSet.add(new Employee(104,"Kunal",150));
		
		for (Employee emp:employeeSet) {
			System.out.println(emp);
		}
		
		employeeSet=new TreeSet<>();
		employeeSet.add(new Employee(101,"Ram",200));
		employeeSet.add(new Employee(102,"Nirmal",100));
		employeeSet.add(new Employee(104,"Kunal",150));
		
		for (Employee emp:employeeSet) {
			System.out.println(emp);
		}
		

	}

}
