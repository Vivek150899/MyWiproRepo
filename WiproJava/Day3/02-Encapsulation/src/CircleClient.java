
public class CircleClient {

	public static void main(String[] args) {
		Circle c1;          //it is not initialized 
		 c1=new Circle();   //Initialization
		c1.setRadius(5);
		
		 //c1.radius=5;
       System.out.println(c1.getRadius());
       double  area1=c1.calculateArea();
       System.out.println(area1);
       
       c1=null;
       
       
       
       Circle c2;
       c2=new Circle();
       c2.setRadius(-10);
       c2.getRadius();
     //  c2.radius=10;
       System.out.println(c2.getRadius());
       double  area2=c2.calculateArea();
       System.out.println(area2);
       
       
       
	}
	

}
