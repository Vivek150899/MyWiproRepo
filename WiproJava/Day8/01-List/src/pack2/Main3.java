package pack2;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ageList;
		ageList=new LinkedList<>();
		
		ageList.add(Integer.valueOf(30));
		ageList.add(40);
		ageList.add(50);
		ageList.add(Integer.valueOf(60));
		ageList.add(50);
		
		System.out.println(ageList);
		
		Object[] arr=new Object[ageList.size()];
		
		for (Object obj:arr) {
			System.out.println(obj);
		}
		
		
		

	}

}
