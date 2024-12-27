package pack2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> products=new LinkedList<>();
		products.add("Dell");
		products.add("Lenovo");
		products.add("Acer");
		products.add("Hp");
		products.add("IBM");
		
		System.out.println(products);
		Collections.sort(products);
		System.out.println(products);

	}

}
