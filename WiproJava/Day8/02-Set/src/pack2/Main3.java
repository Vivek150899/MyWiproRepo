package pack2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> ages=new HashSet<>();
		
		ages.add(String.valueOf("Arpit"));
		ages.add(String.valueOf("Shivam"));
		ages.add(String.valueOf("Ramesh"));
		ages.add(String.valueOf("Kunal"));
		ages.add(String.valueOf("Shivam"));
		
		System.out.println(ages);
		
		for (String age:ages) {
			System.out.println(age);
		}
		Iterator<String>it=ages.iterator();
		while(it.hasNext()) {
			String current=it.next();
			System.out.println(current);
			
		}
	}

}
