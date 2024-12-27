package pack2;

import pack1.Circle;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] allCircles=new Circle[4];
		
		allCircles[0]=new Circle(22);
		allCircles[1]=new Circle(5);
		allCircles[2]=new Circle(10);
		allCircles[3]=new Circle(22);
		
		for (Circle c:allCircles) {
			System.out.println(c.getRadius()+" , "+c.getArea());
			System.out.println(c);
		}
	
	}

}
