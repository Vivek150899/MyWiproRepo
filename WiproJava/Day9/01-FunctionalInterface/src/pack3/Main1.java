package pack3;
import pack1.Square;
import pack2.Acceptor;
import pack2.SquareAcceptor;



public class Main1 {

	public static void main(String[] args) {
		Acceptor<Square>acceptor1;
		acceptor1 = new SquareAcceptor();
		
		Square s1=new Square(10);
		acceptor1.accept(s1);
		
		Acceptor<Square>acceptor2;
		acceptor2 = new Acceptor<Square>() {

			@Override
			public void accept(Square obj) {
				System.out.println(obj.getSize());
				
			}
			
		};
		acceptor2.accept(s1);
		
		Acceptor<Square>acceptor3;
		acceptor3 = new Acceptor<Square>() {
			
			@Override
			public void accept(Square obj) {
				System.out.println(obj.getArea());
				
			}
		};
		acceptor3.accept(s1);

	}

}
