package pack2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Map<String, String>map=new HashMap<>();
		
		String s1="Country";
		String s2="India";
		
		String s3="Capital";
		String s4="Delhi";
		
		String s5="Independence Year";
		String s6="1947";
		
		String s7="President";
		String s8="Murmu";
		
		map.put(s1, s2);
		map.put(s3, s4);
		map.put(s5, s6);
		map.put(s7, s8);
		map.put("Country", "USA");
		
		
		System.out.println(map);
	    System.out.println(map.get("President"));
	    
	    Set<String>allKeys=map.keySet();
	    System.out.println(allKeys);
	    
	    Collection<String>allValues=map.values();
	    System.out.println(allValues);
	    
	    for (String key:allKeys) {
	    	System.out.println(key+":"+map.get(key));
	    }
	    for (Map.Entry<String, String> entry:map.entrySet()) {
	    	System.out.println(entry.getKey()+":"+entry.getValue());
	    }
	    

	}

}
