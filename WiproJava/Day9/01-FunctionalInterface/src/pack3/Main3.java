package pack3;

import pack2.Acceptor;

public class Main3 {

	public static void main(String[] args) {
		String str="Welcome";
		
		Acceptor<String> acc1;
		acc1=new Acceptor<String>() {
			
			@Override
			public void accept(String obj) {
				System.out.println(obj.toUpperCase());
				
			}
		};acc1.accept(str);
		
		Acceptor<String> acc2;
		acc2=new Acceptor<String>() {
			
			@Override
			public void accept(String obj) {
				System.out.println(obj.toLowerCase());
				
			}
		};acc2.accept(str);
		
		Acceptor<String> acc3;
		acc3=new Acceptor<String>() {
			
			@Override
			public void accept(String obj) {
				System.out.println(obj.length());
				
			}
		};acc3.accept(str);

	}

}
