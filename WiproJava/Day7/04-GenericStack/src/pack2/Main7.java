package pack2;

import pack1.Circle;
import pack1.Employee;
import pack1.Student;
import pack3.StackImplementation;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation <Integer> stack=new StackImplementation<>(3);
		
		stack.push(200);;
		stack.push(Integer.valueOf(300));
		stack.push(Integer.valueOf(400));
		
		System.out.println(stack);
		
		Integer poppedData=stack.pop();
		System.out.println(poppedData.intValue());
		
		StackImplementation <Circle> stack1=new StackImplementation<>(3);
		stack1.push(new Circle(10));
		stack1.push(new Circle(20));
		stack1.push(new Circle(30));
		System.out.println(stack1);
		
		Circle popData1=stack1.pop();
		System.out.println(popData1.getRadius()+","+popData1.getArea());
        
		StackImplementation <Employee> stack2=new StackImplementation<>(3);
		stack2.push(new Employee(101,"Aman",1000.0));
		stack2.push(new Employee(102,"Achal",2000.0));
		stack2.push(new Employee(103,"Arpit",3000.0));
		System.out.println(stack2);
		
		Employee popData2=stack2.pop();
		System.out.println(popData2.getName()+","+popData2.getNetSalary());
		
		StackImplementation <Student> stack3=new StackImplementation<>(3);
		stack3.push(new Student(101,"Aman",10,20));
		stack3.push(new Student(102,"Achal",11,21));
		stack3.push(new Student(103,"Arpit",30,12));
		System.out.println(stack3);
		
		Student popData3=stack3.pop();
		System.out.println(popData3.getName()+","+popData3.getTotal()+","+popData3.getAverage());
	}

}
