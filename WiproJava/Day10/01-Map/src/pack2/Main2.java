package pack2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>citywiseQuantity;
		
		citywiseQuantity=new TreeMap<>();
		citywiseQuantity.put("Delhi", Integer.valueOf(135));
		citywiseQuantity.put("Kolkata", 122);
		citywiseQuantity.put("Pune", 100);
		citywiseQuantity.put("Mumbai", 20);
		
		System.out.println(citywiseQuantity);
		
		Set<String>allKeys=citywiseQuantity.keySet();
	    System.out.println(allKeys);
	    
	    Collection<Integer>allValues=citywiseQuantity.values();
	    System.out.println(allValues);
	    
	    for (String key:allKeys) {
	    	System.out.println(key+":"+citywiseQuantity.get(key));
	    }
	    for (Map.Entry<String, Integer> entry:citywiseQuantity.entrySet()) {
	    	System.out.println(entry.getKey()+":"+entry.getValue());
	    
	    System.out.println(citywiseQuantity.containsKey("Mumbai"));
	    System.out.println(citywiseQuantity.containsKey("Abc"));
	    System.out.println(citywiseQuantity.containsValue(20));
	    }
		
		
		
	}

}
