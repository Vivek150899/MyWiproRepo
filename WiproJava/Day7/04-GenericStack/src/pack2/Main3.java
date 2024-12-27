package pack2;

import pack1.Circle;
import pack3.CircleStackImplementation;
import pack3.StringStackImplementation;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleStackImplementation stack;
		stack=new CircleStackImplementation(4);
	     
		Circle c1=new Circle(10);
		Circle c2=new Circle(20);
		
		stack.push(c1);
		stack.push(c2);
		
		stack.push(new Circle(30));
		stack.push(new Circle(40));
		
		System.out.println(stack);
		
		Circle poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		System.out.println(stack);

	}

}
