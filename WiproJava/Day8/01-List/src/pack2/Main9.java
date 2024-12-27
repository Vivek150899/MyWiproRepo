package pack2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float>discounts=new LinkedList<>();
		
		discounts.add(Float.valueOf( 15.2f));
		discounts.add(Float.valueOf( 14.5f));
		discounts.add( 18.88f);
		discounts.add(Float.valueOf( 18.0f));
		discounts.add(Float.valueOf( 112.58f));
		
		System.out.println(discounts);
		
		Collections.sort(discounts);
		
		System.out.println(discounts);
		
		
		

	}

}
