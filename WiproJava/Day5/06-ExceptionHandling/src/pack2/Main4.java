package pack2;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Begins......");
		
		try {
		System.out.println(100/10);
		System.out.println(Integer.parseInt("abc"));
		System.out.println(new int[] {10,20}[100]);
		}catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
			
		}catch(NumberFormatException e) {
			System.out.println("Number Conversion Failed");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array Index");
		}finally {
			System.out.println("Always Executes");
		}
		
		System.out.println("Program Ends........");

	}

}
