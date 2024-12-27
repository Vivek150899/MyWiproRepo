//import java.util.Scanner;
public class SquareClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Square s1;
		s1=new Square();
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Size");
	   // s1.size=sc.nextInt();
		//s1.size=5;
		s1.setSize(5);
		System.out.println(s1.getSize());
		int result1=s1.computeArea();
		System.out.println(result1);
		
		Square s2;
		s2=new Square();
		System.out.println("Enter the Second Size");
		//s2.size=sc.nextInt();
		s2.setSize(20);
		System.out.println(s2.getSize());
		int result2=s2.computeArea();
		System.out.println(result2);
		
		
		s1=null;
		s2=null;
		
	}

}
//initialize/create object 
//set data(size)
//call compute area 
//print area