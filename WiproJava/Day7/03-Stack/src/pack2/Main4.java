package pack2;

import pack1.DoubleStack;


public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoubleStack doubleStack=new DoubleStack(4);
		
        doubleStack.push(10.0f);
        doubleStack.push(20.0);
        doubleStack.push(30.0);
        doubleStack.push(40.0);
		
		System.out.println((doubleStack.toString()));
		
		double poppedValue=doubleStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=doubleStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=doubleStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=doubleStack.pop();
		System.out.println(poppedValue);
		
		System.out.println((doubleStack.toString()));

	}

}
