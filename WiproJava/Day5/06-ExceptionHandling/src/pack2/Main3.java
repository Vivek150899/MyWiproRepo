package pack2;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program Begins......");
		
		String str= "20abc6";
		
		try {
			
		int i=Integer.parseInt(str);
		i++;
		System.out.println(i);
		}
		catch(NumberFormatException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program Ends........");

	}

}
