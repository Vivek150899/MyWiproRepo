package pack2;
import pack1.Employee;
import pack1.Student;
import pack3.ObjectStackImplementation;
import pack1.Circle;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1=Integer.valueOf(100);
		Double obj2=Double.valueOf(100.0);
		String obj3=String.valueOf("Acahl");
		Circle obj4=new Circle(20);
		Employee obj5=new Employee(101,"Aman",1000.0);
		Student obj6=new Student(101,"Aman",10,12);
		
		
		ObjectStackImplementation stack=new ObjectStackImplementation(5);
		
		stack.push(obj1);
		stack.push(obj2);
		stack.push(obj3);
		stack.push(obj4);
		stack.push(obj5);
		stack.push(obj6);
		
		System.out.println(stack);
		
		Object obj=stack.pop();
		
		if (obj instanceof Integer) {
			Integer temp=(Integer) obj;
			System.out.println(temp.floatValue());
		}
		if (obj instanceof Double ) {
			Double temp=(Double) obj;
			System.out.println(temp.intValue());
		}
		if (obj instanceof String) {
			String temp=(String) obj;
			System.out.println(temp.toUpperCase());
		}
		if (obj instanceof Circle) {
			Circle temp=(Circle) obj;
			System.out.println(temp.getRadius()+","+temp.getArea());
		}
		if (obj instanceof Employee) {
			Employee temp=(Employee) obj;
			System.out.println(temp.getName()+","+ temp.getNetSalary());
		}
		if (obj instanceof Student) {
			Student temp=(Student) obj;
			System.out.println(temp.getName()+","+ temp.getTotal()+","+ temp.getAverage());
		}
		
		
		

	}

}
