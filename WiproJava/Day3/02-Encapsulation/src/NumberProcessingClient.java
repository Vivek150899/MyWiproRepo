
public class NumberProcessingClient {

	public static void main(String[] args) {
		
		NumberProcessing NP=new NumberProcessing();
	    long result1=NP.computeFactorial(5);
	    System.out.println(result1);
	    
	    
	    long result2=NP.findSum(1,10);
	    System.out.println(result2);
	    
	    
	    //int result3=NP.printNumbers(300, 200);	 
	 //   System.out.println(result3);
	    NP.printNumbers(300, 200);
	    

	}

}
