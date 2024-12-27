
public class Circle {
     private int radius;
     
     void setRadius(int r) {
    	 if (r<0) {
    		 System.out.println("Invalid Radius");
    	 }
    	 else
    		 this.radius=radius;
     }
     int getRadius() {
    	 return this.radius;
     }
      double calculateArea() {
    	  final double PI=3.14;
    	  double area=PI*radius*radius;
    	  return area;
      }
}
