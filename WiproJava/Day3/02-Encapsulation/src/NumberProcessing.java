
public class NumberProcessing {
	
    int fact=1;
	int sum=0;
	long computeFactorial(int num) {
		//compute and return the factorial of num
		 if (num==1) {
			 return fact;
		 }
		    for (int i = 2; i <= num; i++)
		        fact *= i;
		    return fact;
	}
	
	long findSum(int startNumber, int endNumber) {
		//compute and return the sum between start and end number
		for (int i=startNumber;i<=endNumber;i++) {
			sum+=i;
		}
		return sum;
	}
	
	void printNumbers(int endNumber, int startNumber) {
		// print all the numbers between endNumber and startNumber in reverse
		System.out.println("Before Reversing the Result is :");
		for (int i=startNumber;i<=endNumber;i++) {
			System.out.println(i);
		}
		System.out.println("After Reversing the Result is :");
		int i=endNumber;
		while(i>=startNumber) {
            System.out.println(i);
            i--;

		}
		
		
		
		
		
	}

}
