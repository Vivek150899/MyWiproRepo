package pack2;
import pack1.Circle;
import pack1.Employee;
import pack1.Circle;
import pack3.Stack;
import pack3.StackImplementation1;

public class Main8 {

	public static void main(String[] args) {
		Stack<Circle> stack1=new StackImplementation1<>(3);
		Stack<Employee> stack2=new StackImplementation1<>(4);
		Stack<String> stack3=new StackImplementation1<>(5);
		Stack   stack4=new StackImplementation1<>(4);
		
		stack4.push(new Object());
		stack4.push(new Circle(1));
		stack4.push("Welcome");
		stack4.push(new Employee(1,"Ram",100.0));
		
		
		
		

	}

}
