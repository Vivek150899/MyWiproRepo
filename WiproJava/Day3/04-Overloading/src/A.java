
public class A {
    void f1(int i) {
    	System.out.println("Welcome");
    }
    int f1(int i,int j) {
    	System.out.println("Mumbai..Pune");
    	return 0;
    }
    void f2(short a,int b) {
    	System.out.println("GoodBye..."+(a+b));
    }
    void f2(int a , int b) {
    	System.out.println("How are You... "+(a+b));
    }
    void f2(byte b) {
    	System.out.println("f2 with byte "+b);
    }
    void f2(int b) {
    	System.out.println("f2 with int "+b);
    }
    void f2(long b) {
    	System.out.println("f2 with long "+b);
    }
    final void f3(long b) {
    	System.out.println("f2 with long "+b);
    }
    final void f3(int b) {
    	System.out.println("f2 with long "+b);
    }
    
    static void greet() {
    	System.out.println("Hello");
    }
    static void greet(int n) {
    	for(int i=0;i<=1;i++) {
    		System.out.println("Hello");
    	}
    }
}
