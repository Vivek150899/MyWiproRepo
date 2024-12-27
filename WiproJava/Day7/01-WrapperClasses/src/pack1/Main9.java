package pack1;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		
		Character obj1=Character.valueOf(c1);
		
        char c2='A';
		
		Character obj2=Character.valueOf(c2);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		
        char c3='A';
		
		Character obj3=Character.valueOf(c3);
		
		//conversion method not available
		//parse functon not available
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isDigit('8'));
		
		
		
		

	}

}
