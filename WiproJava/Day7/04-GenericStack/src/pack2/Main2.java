package pack2;


import pack3.StringStackImplementation;

public class Main2 {

	public static void main(String[] args) {
		StringStackImplementation stack=new StringStackImplementation(4);
	     
		String obj1=String.valueOf("Delhi");
		String obj2=String.valueOf("Mumbai");
		
		stack.push(String.valueOf("Kolkata"));
		stack.push(String.valueOf("Nagpur"));
		
		stack.push(obj1);
		stack.push(obj2);
		
		System.out.println(stack);
		
		String poppedInteger=stack.pop();
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
