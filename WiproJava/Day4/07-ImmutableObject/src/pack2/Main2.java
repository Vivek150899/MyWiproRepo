package pack2;

import pack1.Circle;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(5);
		System.out.println(c1);
		
		Circle c2=c1.convert();
		System.out.println(c2);
		
		Circle c3=c2.convert();
		System.out.println(c3);
		
	}

}
