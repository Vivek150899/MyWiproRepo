import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		System.out.println("Enter upto the number : ");
		int upto = sc.nextInt();
		
		for (int i = 1; i <= upto; i++) {
			System.out.println(i + " X "+number+" = " + (i * number));
		}

	}

}
