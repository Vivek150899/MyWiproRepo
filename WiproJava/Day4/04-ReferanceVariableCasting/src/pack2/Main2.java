package pack2;

import pack1.A;
import pack1.B;
import pack1.C;

public class Main2 {

	static void process(A a) {
		a.hello();  //Dynamic method dispatching
		a.greet();

		if (a instanceof B) {
			B b = (B) a;
			b.sayWelcome();
		}
		if (a instanceof C) {
			C c = (C) a;
			c.sayGoodBye();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj;
		obj = new B();
		// obj.hello();
		// obj.greet();
		process(obj);

		obj = new C();
		// obj.hello();
		// obj.greet();

		process(obj);
	}

}
