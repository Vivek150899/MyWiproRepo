package pack2;

import pack1.BooleanStack;


public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BooleanStack booleanStack=new BooleanStack(4);
		
        booleanStack.push(true);
		booleanStack.push(false);
		booleanStack.push(false);
		booleanStack.push(true);
		
		System.out.println((booleanStack.toString()));
		
		boolean poppedValue=booleanStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=booleanStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=booleanStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=booleanStack.pop();
		System.out.println(poppedValue);
		
		System.out.println((booleanStack.toString()));

	}

}
