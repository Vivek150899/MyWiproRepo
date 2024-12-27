package pack2;


import java.util.Set;
import java.util.TreeSet;

import pack1.Circle;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Circle> circleSet=new TreeSet<>();
		
		circleSet.add(new Circle(50));
		circleSet.add(new Circle(20));
		circleSet.add(new Circle(30));
		circleSet.add(new Circle(10));
		circleSet.add(new Circle(40));
		circleSet.add(new Circle(10));
		
		System.out.println(circleSet);

	}

}
