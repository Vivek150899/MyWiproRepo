
 class A {
	 void saySomething() {
		 System.out.println("C++");
	 }
	 
	 int doSomething() {
		 return 10;
	 }

}
 class B extends A{
	 
	 @Override
	 void saySomething() {
		 System.out.println("Java");
	 }
 }
 
 class Main{
	 public static void main(String[] args) {
		B obj=new B();
		obj.saySomething();
		System.out.println(obj.doSomething());
	}
 }
