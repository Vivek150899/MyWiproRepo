package pack1;

abstract public class A {
      public abstract void m1(); 
      
      public abstract void m2();
      
      public void m3() {        //Concrete method if author wants than can override
    	  System.out.println("Some Thing");
      }
      public final void m4() {      //final method can not be override
    	  System.out.println("Welcome");
    	  
      }  
}
