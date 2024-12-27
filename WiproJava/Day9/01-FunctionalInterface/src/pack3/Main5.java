package pack3;

import pack1.Square;
import pack2.Acceptor;

public class Main5 {

	public static void main(String[] args) {
		Square square=new Square(10);
		
		Acceptor<Square>squareAcceptor;
		//Lambda Expressions
		squareAcceptor=(Square obj)->{
			System.out.println(obj.getSize());
		};squareAcceptor.accept(square);
		//can also do this with
		Acceptor<Square>squareAcceptor1;
		squareAcceptor1=(Square obj)->System.out.println(obj.getSize());
		squareAcceptor1.accept(square);
		
		Acceptor<Square>squareAcceptor2=(obj)->System.out.println(obj.getArea());
		squareAcceptor2.accept(square);	
		
		Acceptor<Square>squareAcceptor3=(obj)->System.out.println(obj.getArea());
		squareAcceptor3.accept(square);
			

	}

}
