package pack2;
import pack1.Circle;
import pack1.Employee;
import pack1.Student;

public class Main4 {
	static void print(Object obj) {
		System.out.println(obj.toString());
		
		if (obj instanceof Circle) {
			Circle c=(Circle) obj;
			System.out.println(c.radius);
		}
		
		if (obj instanceof Employee) {
			Employee e=(Employee) obj;
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getBasicSalary());
			
		}
		
		if (obj instanceof Student) {
			Student s=(Student) obj;
			System.out.println(s.getRollNumber());
			System.out.println(s.getName());
			System.out.println(s.getMark1());
			System.out.println(s.getMark2());
			System.out.println(s.getMark3());
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		obj=new Circle(5);
		//System.out.println(obj);
		print (obj);
		
		
		obj=new Employee(101,"Ram",1000.0);
		//System.out.println(obj);
		print (obj);
		
		
		obj=new Student(101,"Ram",23,24,25);
		//System.out.println(obj);
		print (obj);
		
		
		
		

	}

}
