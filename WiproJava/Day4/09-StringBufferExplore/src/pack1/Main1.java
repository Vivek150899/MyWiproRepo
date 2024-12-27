package pack1;
import java.lang.StringBuffer;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Welcome");
		//String s1="Welcome";
		System.out.println(s1);
		
		s1.append(" ");
		s1.append("to");
		s1.append(" ");
		s1.append("Java");
		s1.append(" ");
		s1.append("5");
		s1.append(" times. ");
		System.out.println(s1);
		s1.insert(5, "I am at wipro ");
		System.out.println(s1);
		s1.delete(5, 8);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer();
		s2.append("java").append(" ").append("is fun,");
		System.out.println(s2);
		System.out.println(s2.length());
		
		String str=s1.toString();//immutable object
		
		
		
		

	}

}
