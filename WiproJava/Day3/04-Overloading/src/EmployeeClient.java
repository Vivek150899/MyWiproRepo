
public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e=new Employee();
        e.setBasicSalary(10000.00);
        
        System.out.println(e.getNetSalary());
        System.out.println(e.getNetSalary(500.00));
        System.out.println(e.getNetSalary(30,5000.00));
        System.out.println(e.getNetSalary(10));
	}

}
