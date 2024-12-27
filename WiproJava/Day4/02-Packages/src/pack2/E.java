package pack2;
import pack1.A;
public class E extends A{
	
   public void test6() {
	 //  System.out.println(v1);   error
	//	System.out.println(v2);     error
		System.out.println(v3);
		System.out.println(v4);
   }
   public void test7() {
	   A obj=new A();
	//   System.out.println(obj.v1);   error
	//	System.out.println(obj.v2);    error
	//	System.out.println(obj.v3);    error
		System.out.println(obj.v4);
   }
}

/*   private most restrictive
 *   default
 *   protected
 *   public less restrictive
 */
