package pack1;

public class C extends A{

	@Override
	public void m1() {
		System.out.println("Some Thing m1 in c");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Some Thing  m2 in c");
		
	}
	
	@Override
	public void m3() {        //Concrete method if author wants than can override
  	  System.out.println("Some Thing in c");
    }

}
