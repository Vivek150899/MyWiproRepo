package pack1;

public class Main1 {
	public static void main(String[] args) {
		
		String s1=new String("  Wipro is my company at city Banglore");
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf("my"));
		System.out.println(s1.indexOf("c"));
		
		System.out.println(s1.lastIndexOf("c"));
		System.out.println(s1.lastIndexOf("at"));
		
		
		
		System.out.println(s1.substring(5,15));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s3=s1.replace('i', 'y');
		System.out.println(s3);
		System.out.println(s1.startsWith("Wipro"));
		System.out.println(s1.endsWith("Banglore"));
		System.out.println(s1.contains("is"));
		System.out.println(s1.trim());
		
		
	}

}
