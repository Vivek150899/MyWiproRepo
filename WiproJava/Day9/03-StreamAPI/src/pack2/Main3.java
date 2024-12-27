package pack2;

import java.util.HashSet;
import java.util.Set;


import pack1.Square;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Square>squareSet=new HashSet<>();
		squareSet.add(new Square(5));
		squareSet.add(new Square(20));
		squareSet.add(new Square(15));
		squareSet.add(new Square(7));
		squareSet.add(new Square(18));
		
		squareSet.forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		squareSet.stream().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		squareSet.stream().sorted().forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		squareSet.stream().filter(c->c.getSize()>10).forEach((c)->System.out.println(c));
		System.out.println("-------------------------------");
		squareSet.stream().filter(c->c.getArea()>100).sorted().forEach((c)->System.out.println(c));

	}

}
