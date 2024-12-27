package pack2;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double>priceList;
		priceList=new LinkedList<>();
		priceList.add(12.0);
		priceList.add(23.4);
		priceList.add(1, 23.1);
		priceList.add(36.3);
		priceList.add(32.9);
		
		
		System.out.println(priceList);
		System.out.println(priceList.size());
		
		System.out.println(priceList.remove(2));
		System.out.println(priceList);
		
		System.out.println(priceList.contains("12.0"));
		
		int position=priceList.indexOf("32.9");
		System.out.println(position);
		
		System.out.println(priceList.isEmpty());
		System.out.println(priceList.get(priceList.size()-1));
		
		priceList.set(0,12.1);
		System.out.println(priceList);
		
		for(int i=0;i<priceList.size();i++) {
			System.out.println(priceList.get(i));
		}
		
		for (Double city:priceList) {
			System.out.println(city);
		}
		
		Iterator<Double>it=priceList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		priceList.clear();
		System.out.println(priceList);
		System.out.println(priceList.size());
		System.out.println(priceList.isEmpty());

	}

	}


