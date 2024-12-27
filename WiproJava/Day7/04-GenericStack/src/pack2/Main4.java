package pack2;


import pack1.Circle;
import pack1.Employee;
import pack3.CircleStackImplementation;
import pack3.EmployeeStackImplementation;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1020,"Ram",5000.0);
		Employee e2=new Employee(1021,"Raman",6000.0);
		
		
		EmployeeStackImplementation stack;
		stack=new EmployeeStackImplementation(4);
	     
		
		stack.push(e1);
		stack.push(e2);
		
		stack.push(new Employee(1022,"Arpit",4000.0));
		stack.push(new Employee( 1022,"Achal",3000.0));
		
		System.out.println(stack);
		
		Employee poppedEmployee=stack.pop();
		System.out.println(poppedEmployee.getId());
		System.out.println(poppedEmployee.getName());
		System.out.println(poppedEmployee.getBasic());
		System.out.println(poppedEmployee.getNetSalary());
		
		
		
		poppedEmployee=stack.pop();
		System.out.println(poppedEmployee.getId());
		System.out.println(poppedEmployee.getName());
		System.out.println(poppedEmployee.getBasic());
		System.out.println(poppedEmployee.getNetSalary());
		
		poppedEmployee=stack.pop();
		System.out.println(poppedEmployee.getId());
		System.out.println(poppedEmployee.getName());
		System.out.println(poppedEmployee.getBasic());
		System.out.println(poppedEmployee.getNetSalary());
		
		poppedEmployee=stack.pop();
		System.out.println(poppedEmployee.getId());
		System.out.println(poppedEmployee.getName());
		System.out.println(poppedEmployee.getBasic());
		System.out.println(poppedEmployee.getNetSalary());
		
		System.out.println(stack);

	}
	}


