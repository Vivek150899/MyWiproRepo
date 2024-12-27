
public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //create one employee object
		//print the data in employee object
		
	    Employee emp=new Employee(1,"Chetan Sharma", 45670.00);
	    
	   
	    System.out.println("Employee Data : ");
	    System.out.println("Employee ID is : "+emp.getId());
	    System.out.println("Employee name is : "+emp.getName());
	    System.out.println("Basic Salary of Employee is : "+emp.getBasic());
	    
	}

}
