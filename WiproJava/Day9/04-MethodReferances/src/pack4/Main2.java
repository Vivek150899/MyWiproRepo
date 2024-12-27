package pack4;

import pack2.GoodBye;
import pack2.Hello;
import pack2.Welcome;

public class Main2 {

	public static void main(String[] args) {
		Hello hello;
		
		hello=()->System.out.println("Welcome");
		hello.doIt();  //one method by lambda function
		
		Welcome w=new Welcome();
		
		hello=w::sayWelcome;//method reference for instance method 
		hello.doIt();//second method
		
        GoodBye g=new GoodBye();
		
		hello=g::sayGoodBye;//method reference for instance method 
		hello.doIt();
		
		
		

	}

}
