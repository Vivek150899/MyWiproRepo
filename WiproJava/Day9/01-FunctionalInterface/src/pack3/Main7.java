package pack3;

import pack2.Acceptor;

public class Main7 {

	public static void main(String[] args) {
		String str="Welcome to wipro";
		
		Acceptor<String> acc1=(string)->System.out.println(string.toUpperCase());
		acc1.accept(str);
		
		Acceptor<String> acc2=(string)->System.out.println(string.toLowerCase());
		acc2.accept(str);
		
		Acceptor<String> acc3=(string)->System.out.println(string.length());
		acc3.accept(str);

	}

}
