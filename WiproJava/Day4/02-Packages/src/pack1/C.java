package pack1;

public class C extends A{
	public void test3() {
		
	 // 	System.out.println(v1);  //error
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
	public void test4() {
		A obj = new A();
     //   System.out.println(obj.v1);  //error
		System.out.println(obj.v2);
		System.out.println(obj.v3);
		System.out.println(obj.v4);
	}

}
