package pack1;

public class A {
	
		 A(){
			System.out.println("aaaa");
		}
		 
		int m1(double a) {
			System.out.println(a);
			return 0;
		}
		
		private void m2(int x) {
			System.out.println(x);
		}
		
	    static void m3() {
	    	
	    }
	    
	    final public void m4() {
	    	System.out.println("abcd");
	    }
}
    class B extends A{
	//@Override
  //	A(){
	//	System.out.println("aaaa");
	//}
	 
	@Override
	public int m1(double a) {
		System.out.println(a*a);
		return 1;
	}
	
 //   @Override
//    public void m2(int a) {
//	  System.out.println(a*a);
	//}
	
//@Override
//static void m3() {
    //	System.out.println("how are you");
   // }

//@Override
//public void m4() {
//	System.out.println("abcd");
//}

}

//return type and parameter, method should be same 
//we can increase into public not reduce to private
// access modifiers should be same or higher
//private method can be redefined but can not be considered as override
// methods can be redefined in subclasses
//Static methods can not be considered as an overriding as they can be redefined in subclass
//static method can be refined as static as well as vice versa for instance
//Final methods can not be overridden in subclasses 
//Constructors can not be overridden