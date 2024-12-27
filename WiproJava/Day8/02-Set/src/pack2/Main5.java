package pack2;

import java.util.HashSet;
import java.util.Set;

import pack1.Circle;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Circle> circleSet=new HashSet<>();
		
		circleSet.add(new Circle(10));
		circleSet.add(new Circle(20));
		circleSet.add(new Circle(30));
		circleSet.add(new Circle(10));
		circleSet.add(new Circle(40));
		circleSet.add(new Circle(10));
		
		System.out.println(circleSet);
		

	}

}
