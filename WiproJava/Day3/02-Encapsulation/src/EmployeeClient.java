import java.util.Scanner;
public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
      Employee emp1=new Employee();
     // emp1.grade=sc.nextInt();
     //  emp1.basicSalary=sc.nextDouble();
    //  emp1.grade='A';
      emp1.setGrade('A');
      emp1.setBasicSalary(10000.0);
     // emp1.basicSalary=100000.00;
      System.out.println(emp1.getGrade());
      System.out.println(emp1.getBasicSalary());
      double allowance1=emp1.calculateAllowance();
      System.out.println(allowance1);
      
      emp1=null;
      
      Employee emp2=new Employee();
     // emp2.grade='B';
     //  emp2.basicSalary=50000.00;
      emp2.setGrade('C');
      emp2.setBasicSalary(10000.0);
      System.out.println(emp2.getGrade());
      System.out.println(emp2.getBasicSalary());
      double allowance2=emp2.calculateAllowance();
      System.out.println(allowance2);
      
      emp2=null;
      
	}

}
