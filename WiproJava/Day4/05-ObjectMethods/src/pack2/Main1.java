package pack2;
import pack1.Circle;
import pack1.Student;
import pack1.Employee;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle();
		c1.radius=20;
		System.out.println(c1.radius);
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
		
		Circle c2= new Circle();
		c2.radius=100;
		System.out.println(c2.radius);
		System.out.println(c2.hashCode());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
		
		Object  obj=c1;
		obj=c2;
		obj= new Student();
		obj=new Employee();
		

	}

}
