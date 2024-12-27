package pack1;

public class Main10 {

	public static void main(String[] args) {
		
		boolean v1=true;
		Boolean obj1=Boolean.valueOf(v1);
		
		boolean v2=true;
		Boolean obj2=Boolean.valueOf(v2);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		
		boolean v3=false;
		Boolean obj3=Boolean.valueOf(v3);
		
		//Conversion methods are not availeble
		
		Boolean obj4=true; //auto boxing
		boolean v4=obj4;   //auto unboxing
		
		System.out.println(Boolean.parseBoolean("true"));
		

	}

}
