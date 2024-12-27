package pack3;

import pack2.Acceptor;

public class Main4 {

	public static void main(String[] args) {
		Integer iobj=Integer.valueOf(4000);
		
		Acceptor<Integer>acc1;
		acc1=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.byteValue());
				
			}
		};acc1.accept(iobj);
		
		Acceptor<Integer>acc2;
		acc2=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.shortValue());
				
			}
		};acc2.accept(iobj);
		
		Acceptor<Integer>acc3;
		acc3=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.floatValue());
				
			}
		};acc3.accept(iobj);
		
		Acceptor<Integer>acc4;
		acc4=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.doubleValue());
				
			}
		};acc4.accept(iobj);
		
		Acceptor<Integer>acc5;
		acc5=new Acceptor<Integer>() {
			
			@Override
			public void accept(Integer obj) {
				System.out.println(obj*obj);
				
			}
		};acc5.accept(iobj);

	}

}
