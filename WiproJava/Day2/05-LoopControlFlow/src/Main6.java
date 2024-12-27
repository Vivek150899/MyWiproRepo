
public class Main6 {

	public static void main(String[] args) {
		int i = 2, m = 0;
		boolean flag = false;
		int n = 35;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			while (i <= m) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = true;
					break;
				}
				i++;
			}
			if (flag == false) {
				System.out.println(n + " is prime number");
			}

		}
	}

}
