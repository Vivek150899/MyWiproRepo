package pack2;
import pack1.Circle;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=50;
		System.out.println(a==b);
		
		Circle c1=new Circle(5);
		Circle c2=new Circle(5);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(null));
		System.out.println(c1.equals(c2));

	}

}
