package pack2;

import pack1.Circle;
import pack1.Employee;

public class Main5 {

	public static void main(String[] args) {
		// create the array of eployee and print elements
        Employee[] employee=new Employee[4];
        
        
		employee[0]=new Employee(1,"Abhishek",2000);
        employee[1]=new Employee(2,"Achal",1500);
        employee[2]=new Employee(3,"Arpit",1200);
        employee[3]=new Employee(4, "Soumya",5000);
        
        for (Employee i:employee) {
        	System.out.println(i);
        	System.out.println(i.getBasic());
        	System.out.println(i.getNetSalary());
        }
		
        
        
	}

}
