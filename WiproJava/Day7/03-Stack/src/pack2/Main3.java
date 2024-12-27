package pack2;

import pack1.FloatStack;


public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FloatStack floatStack=new FloatStack(4);
		
		floatStack.push(10.0f);
		floatStack.push(20.0f);
		floatStack.push(30.0f);
		floatStack.push(40.0f);
		
		System.out.println((floatStack.toString()));
		
		float poppedValue=floatStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=floatStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=floatStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=floatStack.pop();
		System.out.println(poppedValue);
		
		System.out.println((floatStack.toString()));
	}

}
