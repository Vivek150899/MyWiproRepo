
public class MainPr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[5];
		array[0] = 4.1;
		array[1] = 5.3;
		array[2] = 1.7;
		array[3] = 6.0;
		array[4] = 1.4;
		double sum = 0.0;
		double avg = 0.0;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println("The Size if the Array is :"+array[i]);
		}
		for (double v : array) {
			System.out.println(v);
			sum += v;

		}
		for (double v : array) {
			if (v < min) {
				min = v;
			}
			if (v > max) {
				max = v;
			}
		}
		avg = sum / (array.length + 1);
		System.out.println("The min number of array is :"+min);
		System.out.println("The max number of array is"+max);
		System.out.println("The sum number of array is"+sum);
		System.out.println("The average number of array is"+avg);

	}
}
