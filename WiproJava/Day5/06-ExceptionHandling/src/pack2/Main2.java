package pack2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Begins......");
		
		int arr[]= {2,3,4,5};
		try {
			System.out.println(arr[100]);
		}
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println(e.getMessage());
	    }
		
		System.out.println("Program Ends........");


	}

}
