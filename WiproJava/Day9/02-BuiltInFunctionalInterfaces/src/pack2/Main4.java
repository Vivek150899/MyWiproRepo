package pack2;

import java.awt.Rectangle;
import java.util.function.Function;

import pack1.Circle;
import pack1.Ractngle;
import pack1.Square;

public class Main4 {

	public static void main(String[] args) {
		// Use of Function Interface
		Function<Square,Circle>function1;
		Square square=new Square(10);
		function1=(s)->new Circle(square.getSize());
		Circle circle=function1.apply(square);
		System.out.println(circle);
		
		Function <Square, Ractngle>function2;
		function2=(s)-> new Ractngle (square.getSize(),square.getSize()*2);
		Ractngle ractangle =function2.apply(square);
		System.out.println(ractangle);
		System.out.println(ractangle.getWidth());
		System.out.println(ractangle.getHeight());
		

	}

}
