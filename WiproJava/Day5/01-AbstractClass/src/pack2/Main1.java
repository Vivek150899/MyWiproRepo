package pack2;

import pack1.A;
import pack1.B;
import pack1.C;
import pack1.D;
import pack1.E;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A obj =new A();  //for abstract method objects can not be created
        A obj;
        obj=new B();
        obj.m1();
        obj.m2();
        
        obj=new C();
        obj.m1();
        obj.m2();
       //  obj=new D(); abstract method can not be enharited
       // obj.m1();
        
        obj=new E();
        obj.m1();
        obj.m2();
	}

}
//