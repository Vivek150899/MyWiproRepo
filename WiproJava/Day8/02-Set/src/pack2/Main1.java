package pack2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ages=new HashSet<>();
		
		ages.add(Integer.valueOf(40));
		ages.add(Integer.valueOf(30));
		ages.add(Integer.valueOf(50));
		ages.add(Integer.valueOf(30));
		ages.add(Integer.valueOf(20));
		
		System.out.println(ages);
		
		for (int age:ages) {
			System.out.println(age);
		}
		Iterator<Integer>it=ages.iterator();
		while(it.hasNext()) {
			Integer current=it.next();
			System.out.println(current);
			
		}
		

	}

}
