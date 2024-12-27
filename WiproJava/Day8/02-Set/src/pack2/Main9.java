package pack2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import pack1.Employee;



public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Employee>employeeSet;
		
		employeeSet=new HashSet<>();
		
		employeeSet.add(new Employee(101,"Ram",200));
		employeeSet.add(new Employee(102,"Nirmal",100));
		employeeSet.add(new Employee(104,"Kunal",300));
		
		for (Employee emp:employeeSet) {
			System.out.println(emp);
		}

		Iterator<Employee>it=employeeSet.iterator();
		while(it.hasNext()) {
			Employee current=it.next();
			System.out.println(current);
			
		}
	}

}
