package pack2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import pack1.Circle;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Circle> allCircles=new LinkedList<>();
		
		allCircles.add(new Circle(15));
		allCircles.add(new Circle(5));
		allCircles.add(new Circle(12));
		allCircles.add(new Circle(7));
		
		System.out.println(allCircles);
		
		Collections.sort(allCircles);
		
		System.out.println(allCircles);
		
		
		

	}

}
