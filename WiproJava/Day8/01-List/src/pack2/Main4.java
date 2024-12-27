package pack2;

import java.util.LinkedList;
import java.util.List;

import pack1.Circle;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Circle>circleList;
		circleList =new LinkedList<>();
		
		Circle c1=new Circle(5);
		Circle c2=new Circle(10);
		
		circleList.add(c1);
		circleList.add(c2);
		circleList.add(new Circle(5));
		circleList.add(new Circle(10));
		circleList.add(new Circle(40));
		circleList.add(new Circle(60));
		
		System.out.println(circleList);
		
		for (Circle cir:circleList) {
			System.out.println(cir.getRadius());
		}
		

	}

}
