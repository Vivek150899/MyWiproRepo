package pack2;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import pack1.Employee;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1055,"Aman",'M','A',"Mumbai",2000.0);
		Employee e2= new Employee(1056,"Arathi",'F','B',"Delhi",1000.0);
		Employee e3= new Employee(1057,"Nirmala",'F','A',"Mumbai",3000.0);
		Employee e4= new Employee(1058,"Kirti",'F','C',"Mumbai",21000.0);
		Employee e5= new Employee(1059,"Ashok",'M','A',"Delhi",11000.0);
		Employee e6= new Employee(1060,"Shruti",'F','B',"Mumbei",38000.0);
		
		
		List<Employee>allEmployees=new LinkedList<>();
		
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(e3);
		allEmployees.add(e4);
		allEmployees.add(e5);
		allEmployees.add(e6);
		
		Map<String,Integer>map=new TreeMap<>();
		for (Employee e:allEmployees) {
			String city=e.getCity();
			if (!map.containsKey(city)) {
				map.put(city, 1);	
			}else {
				map.put(city, map.get(city)+1);
			}
		}
		System.out.println(map);
	}

}
