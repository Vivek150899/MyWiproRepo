package pack2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> years=new LinkedList<>();
		
		years.add(Integer.valueOf(2012));
		years.add(Integer.valueOf(1998));
		years.add(Integer.valueOf(2000));
		years.add(Integer.valueOf(2002));
		years.add(Integer.valueOf(2006));
		
		System.out.println(years);
		
		Collections.sort(years);
		
		System.out.println(years);
		years.clear();
		System.out.println(years);
	}

}
