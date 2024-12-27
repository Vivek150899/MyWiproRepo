
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while (i <= 100) {

			if (sum >= 3000) {
				sum-=i;
				break;}
			sum += i;
			
			i++;
		}
		
		System.out.println(sum);
	}

}
