package pack2;
import pack1.B;
import pack1.A;

public class Main1 {
  
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();       //up casting
		obj.greet();
		obj.hello();
		//obj.sayWelcome();
		//f1(obj);
        
		
		B obj1=(B)obj;   //down casting 
		obj1.greet();
		obj1.hello();
		obj1.sayWelcome();
		
	}
	    

}

//up casting implicit by a type reference to b class
//down casting  storing superclass variable to a subclass 
