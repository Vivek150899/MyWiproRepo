package pack2;

import pack1.Square;

public class SquareAcceptor implements Acceptor<Square>{

	@Override
	public void accept(Square obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
		
	}

}
