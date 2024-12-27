package pack2;

import pack1.Ractangle;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ractangle r1=new Ractangle(20, 30);
		System.out.println(r1);
		
		Ractangle r2=r1.enlerge();
		System.out.println(r2);
		
		Ractangle r3=r2.enlerge();
		System.out.println(r3);
	}

}
