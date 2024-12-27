package pack2;

import pack1.Employee;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(1,"Arpit",20000.0);
		Employee emp2=new Employee(1,"Achal",10000.0);
		
	    double a=emp1.compareTo(emp2);
		System.out.println(a);
		
		if (a<0)
			System.out.println("Invoking Object is Less");
		if (a>0)
			System.out.println("Invoking Object is Greater");
		if (a==0)
			System.out.println("Both are Equal");

	}

}
