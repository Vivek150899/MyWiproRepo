package pack2;

import pack1.Employee;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Employee();
        try {
        emp.setBasicSalary(-10000);
	    }catch(Exception e){
    	System.out.println(e.getMessage());
    	
    }
        
        System.out.println(emp.getBasicSalary());
        
	}

}
