package pack2;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Begins......");
		int a=10;
		int b=0;
		
		try {
			
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Ends........");

	}

}
