package pack2;

import pack1.Circle;
import pack1.Employee;
import pack1.Student;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] allObject=new Object[6];
		
		
		allObject[0]=Integer.valueOf(40);
		allObject[1]=Double.valueOf(300.0);
		allObject[2]="Welcome";
		
		allObject[3]=new Circle(5);
		allObject[4]=new Employee(101,"Ram",1000.0);
		allObject[5]=new Student();
		
		for(Object obj:allObject) {
			System.out.println(obj);
		
		if (obj instanceof Circle) {
			Circle temp=(Circle) obj;
			System.out.println(temp.getArea());
		}
		if (obj instanceof Employee) {
			Employee temp=(Employee) obj;
			System.out.println(temp.getNetSalary());
		}
		
		if (obj instanceof Student) {
			Student temp=(Student) obj;
			System.out.println(temp.getAverage());
			System.out.println(temp.getTotal());
			System.out.println(temp.getRollNumber());
			System.out.println(temp.getMark1());
			System.out.println(temp.getMark2());
			
			
		}
		}
	}

}
