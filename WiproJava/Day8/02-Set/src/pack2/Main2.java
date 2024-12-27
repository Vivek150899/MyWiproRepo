package pack2;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> ages=new TreeSet<>();
		
		ages.add(Integer.valueOf(40));
		ages.add(Integer.valueOf(30));
		ages.add(Integer.valueOf(50));
		ages.add(Integer.valueOf(30));
		ages.add(Integer.valueOf(20));
		
		System.out.println(ages);
		System.out.println(ages.remove(Integer.valueOf(40)));
		System.out.println(ages.contains(20));
		//System.out.println(ages.get(0)); not there
		//ages.set(1,50);
		
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
