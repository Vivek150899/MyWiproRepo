package pack2;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import pack1.Employee;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1055,"Aman",'M','A',"Mumbai",2000.0);
		Employee e2= new Employee(1056,"Arathi",'F','B',"Delhi",1000.0);
		Employee e3= new Employee(1057,"Nirmala",'F','C',"Pune",3000.0);
		
		Map<Integer,Employee>map=new TreeMap<>();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		System.out.println(map.get(3));
	}

}
