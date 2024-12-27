package pack2;

import pack3.IntegerStackImplementation;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerStackImplementation stack=new IntegerStackImplementation(4);
	     
		Integer obj1=Integer.valueOf(30);
		Integer obj2=Integer.valueOf(40);
		
		stack.push(Integer.valueOf(10));
		stack.push(Integer.valueOf(20));
		
		stack.push(obj1);
		stack.push(obj2);
		
		System.out.println(stack);
		
		Integer poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		poppedInteger=stack.pop();
		System.out.println(poppedInteger);
		
		

	}

}
