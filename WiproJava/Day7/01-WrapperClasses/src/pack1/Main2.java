package pack1;

public class Main2 {
	public static void main(String[] args) {
		String s="100";
		
		int x=Integer.parseInt(s);
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toOctalString(120));
		System.out.println(Integer.toHexString(255));
		
		System.out.println(Integer.toString(8, 2));
		System.out.println(Integer.toString(120, 8));
		System.out.println(Integer.toString(255, 16));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
	}

}
