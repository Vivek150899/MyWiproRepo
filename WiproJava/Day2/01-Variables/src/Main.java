
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Circle c1= new Circle();
        c1.count=120;
        System.out.println(c1.count);
        c1.radius=5;
        System.out.println(c1.radius);
        c1.radius=7;
        System.out.println(c1.radius);
        
        Circle c2= new Circle();
        c2.count=123;
        System.out.println(c2.count);
        c2.radius=10;
        System.out.println(c2.radius);
        c1.radius=20;
        System.out.println(c1.radius);
	}

}
