package pack2;

import pack1.Square;

public class Main2 {
	public static void main(String[] args) {
		
	
	Square s1=new Square(15);
	Square s2=new Square(10);
	
	
	
	int a=s1.compareTo(s2);
	System.out.println(a);
	
	if (a<0)
		System.out.println("Invoking Object is Less");
	if (a>0)
		System.out.println("Invoking Object is Greater");
	if (a==0)
		System.out.println("Both are Equal");
	
	
	
	}	

}
