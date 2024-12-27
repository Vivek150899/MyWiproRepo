package pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>cityList;
		cityList=new ArrayList<>();
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add(1, "Haidrabad");
		cityList.add("Kolkata");
		cityList.add("Pune");
		System.out.println(cityList);
		System.out.println(cityList.size());
		System.out.println(cityList.remove(2));
		System.out.println(cityList);
		System.out.println(cityList.contains("Pune"));
		int position=cityList.indexOf("Pune");
		System.out.println(position);
		System.out.println(cityList.isEmpty());
		System.out.println(cityList.get(cityList.size()-1));
		cityList.set(0,"New Delhi");
		System.out.println(cityList);
		
		for(int i=0;i<cityList.size();i++) {
			System.out.println(cityList.get(i));
		}
		
		for (String city:cityList) {
			System.out.println(city);
		}
		
		Iterator<String>it=cityList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toLowerCase());
		}
		cityList.clear();
		System.out.println(cityList);
		System.out.println(cityList.size());
		System.out.println(cityList.isEmpty());

	}

}
