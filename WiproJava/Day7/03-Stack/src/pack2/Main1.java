package pack2;
import pack1.IntStack;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack intStack=new IntStack(6);
		
		intStack.push(20);
		intStack.push(30);
		intStack.push(40);
		intStack.push(50);
		intStack.push(60);
		intStack.push(70);
		
		System.out.println(intStack.toString());
		
		int poppedValue=intStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=intStack.pop();
		System.out.println(poppedValue);
		
		poppedValue=intStack.pop();
		System.out.println(poppedValue);
		
		System.out.println(intStack.toString());

	}

}
