
package pack1;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj=Integer.valueOf(100);
		Integer obj1=Integer.valueOf(100);
		
		System.out.println(obj.equals(obj1));
		
		int r=obj.compareTo(obj1);
		System.out.println(r);
		
		int a=90;
		Integer obj2=Integer.valueOf(a);  //boxing
		Integer obj3=a;   //Auto boxing
		
		Integer obj4=Integer.valueOf(900);
		int b=obj4;  //auto unboxing
		
		Integer obj5=130;
		Integer obj6=130;
		
		
		System.out.println(obj5.equals(obj6));
		System.out.println(obj5==obj6);
		

	}

}
