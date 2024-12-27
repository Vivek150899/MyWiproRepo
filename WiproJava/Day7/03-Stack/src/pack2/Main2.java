package pack2;

import pack1.LongStack;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongStack longStack=new LongStack(4);
		
		longStack.push(10L);
		longStack.push(20L);
		longStack.push(30L);
		longStack.push(40L);
		
		System.out.println((longStack.toString()));
		
		long poppedValue=longStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=longStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=longStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=longStack.pop();
		System.out.println(poppedValue);
		
		System.out.println((longStack.toString()));
		

	}

}
