package pack2;

import pack1.Circle;

public class Main1 {

	private static final Object Object = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(15);
		Circle c2=new Circle(15);
		
		//System.out.println(c1.equals(c2));
		int r=c1.compareTo(c2);
		System.out.println(r);
		
		if (r<0)
			System.out.println("Invoking Object is Less");
		if (r>0)
			System.out.println("Invoking Object is Greater");
		if (r==0)
			System.out.println("Both are Equal");
		
		

	}

}
