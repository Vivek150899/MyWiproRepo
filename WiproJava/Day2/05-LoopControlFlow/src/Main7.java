import java.util.Scanner;
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=1;
		do {
			System.out.println("1. add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Devide");
			System.out.println("5. Exit");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("choice");
			choice=sc.nextInt();
			
			
		}while(choice!=5);
		System.out.println("Thank You");

	}

}
