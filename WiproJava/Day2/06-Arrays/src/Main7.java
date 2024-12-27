
public class Main7 {
	static void f1(int a) {
		System.out.println("a in f1 " + a);
		a++;
		System.out.println("a in f1 " + a);
	}

	 static void f2(int[] arr) {
		for (int v : arr) {
			System.out.println(v + ",");
		}
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		for (int v : arr) {
			System.out.println(v + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		System.out.println("x in main " + x);
		f1(x);
		System.out.println("x in main " + x);
		int[] values = { 1, 2, 3 };
		for (int v : values) {
			System.out.println(v + ",");
		}
		System.out.println();
		f2(values);
		for (int v : values) {
			System.out.println(v + ",");
		}
	}

}
