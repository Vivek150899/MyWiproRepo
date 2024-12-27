package pack3;

import pack2.Acceptor;

public class Main8 {

	public static void main(String[] args) {
		Integer iobj=Integer.valueOf(20);
		
		Acceptor<Integer> acc1=(integer)->System.out.println(integer.doubleValue());
		acc1.accept(iobj);
		
		Acceptor<Integer> acc2=(integer)->System.out.println(integer.byteValue());
		acc2.accept(iobj);
		
		Acceptor<Integer> acc3=(integer)->System.out.println(integer*integer);
		acc3.accept(iobj);
		
		Acceptor<Integer> acc4=(integer)->System.out.println(integer*integer*integer);
		acc4.accept(iobj);

	}

}
