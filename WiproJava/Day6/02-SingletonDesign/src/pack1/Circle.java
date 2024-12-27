package pack1;

public class Circle {
     int radius=10;
     
     public double getArea() {
    	 
    	 return 3.14*this.radius*this.radius;
     }
     private Circle() {
    	 
     }
     private static Circle cir=null;
     
     public static Circle getInstance() {
    	 if (cir==null)
    		 cir=new Circle();
    	 return cir;
     }
}
