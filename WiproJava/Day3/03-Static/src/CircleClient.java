
public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        
        c1.setRadius(5);
        c2.setRadius(10);
        c3.setRadius(15);
    //    Circle.PI=3.14;    static final variables can not be accessed
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());
        
        System.out.println(c1.PI);
     // c2.PI=5.0;
        System.out.println(c1.PI);
        System.out.println(c2.PI);
        System.out.println(c3.PI);
        
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        
	}

}
