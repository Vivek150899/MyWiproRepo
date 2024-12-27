package pack2;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Begins......");
		
		try {
		System.out.println(100/10);
		System.out.println(Integer.parseInt("abc"));
		System.out.println(new int[] {10,20}[100]);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Always Executes");
		}
		
		System.out.println("Program Ends........");

	}

}
