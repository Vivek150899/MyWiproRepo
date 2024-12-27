package pack1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		String s3=new String("WELCOME");
		String s4=new String("GoodBye");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s4));
		
		String v1=new String("ABC");
		String v2=new String("DEF");
		String v3=new String("abc");
		
		int r=v3.compareTo(v1);
		System.out.println(r);
		
		if (r<0) {
			System.out.println("v1 is less than v2");
		}
		if (r>0) {
			System.out.println("v3 is greater than v1");
		}
		if (r==0) {
			System.out.println("Both objects are equal");
		}
		

	}

}
