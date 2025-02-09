package pack2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import pack1.Employee;
import pack1.EmployeeIdAscendingComperator;
import pack1.NameAscendingComparator;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> allEmployees=new LinkedList<>();
		
allEmployees.add(new Employee(1,"Achal",1500.0));
allEmployees.add(new Employee(2,"Arpit",1200.0));
allEmployees.add(new Employee(3,"Vivek",1300.0));
allEmployees.add(new Employee(4,"Abhishek",1800.0));
		
		System.out.println(allEmployees);
		Comparator<Employee>cr=new NameAscendingComparator();
		Collections.sort(allEmployees,cr);
		
		Comparator<Employee>cr1=new EmployeeIdAscendingComperator();
		Collections.sort(allEmployees,cr1);
		
		System.out.println(allEmployees);

	}

}
