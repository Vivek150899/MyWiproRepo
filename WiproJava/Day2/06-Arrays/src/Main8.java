
public class Main8 {

	static void f1(double[] prices) {
		System.out.println();
		for (double x : prices) {
			System.out.println(x + ",");
		}
		prices[0] = 4.5;
		prices[1] = 6.1;
		prices[2] = 5.4;
		System.out.println();
		for (double x : prices) {
			System.out.println(x + ",");
		}
	}

//write a code to print the elements in prices 
//modify the prices 
//write code to print elements in prices 
	
	
	public static void main(String[] args) {
		double[] arr = { 1.0, 3.0, 5.0 };
		for (double x : arr) {
			System.out.println(x + ",");
		}
		
		f1(arr);
		System.out.println();
		for (double x : arr) {
			System.out.println(x + ",");
		}
	}

}
//write a code to print the elements 
//write code to print the elements in arr