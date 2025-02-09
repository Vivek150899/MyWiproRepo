package pack2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import pack1.Employee;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(101,"Ram",'M',"Mumbai",'A',35,35000.0);
		Employee e2= new Employee(102,"Sejal",'F',"Delhi",'A',24,18000.0);
		Employee e3= new Employee(103,"Kartik",'M',"Delhi",'B',28,20000.0);
		Employee e4= new Employee(104,"Aman",'M',"Mumbai",'B',30,32000.0);
		Employee e5= new Employee(105,"Menaka",'F',"Mumbai",'C',28,14000.0);
		Employee e6= new Employee(106,"Arti",'F',"Kolkata",'C',26,16000.0);
		
		List<Employee>employees=new LinkedList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		
		employees.stream().map((e)->e.getBasic()).forEach((d)->System.out.println(d));
		System.out.println("------------------------------------------");
	    employees.stream().map((e)->e.getCity()).forEach((s)->System.out.println(s));
	    System.out.println("------------------------------------------");
	    employees
	    .stream()
	    .sorted((emp1,emp2)->emp1.getCity().compareTo(emp2.getCity()))
	    		.forEach(e->System.out.println(e));
	    
	    System.out.println("------------------------------------------");
	    employees
	    .stream()
	    .sorted((emp1,emp2)->Double.compare(emp1.getBasic(), emp2.getBasic()))
	    		.forEach(e->System.out.println(e));
	    
	    System.out.println("------------------------------------------");
	    boolean allMatchResult1=employees.stream().allMatch((e)->e.getBasic()>50000);
	    System.out.println(allMatchResult1);
	    
	    System.out.println("------------------------------------------");
	    boolean allMatchResult2=employees.stream().allMatch((e)->e.getBasic()>30000);
	    System.out.println(allMatchResult2);
	    
	    System.out.println("------------------------------------------");
	    boolean allMatchResult3=employees.stream().anyMatch((e)->e.getBasic()>30000);
	    System.out.println(allMatchResult3);
	    
	    System.out.println("------------------------------------------");
	    
	    Optional<Employee>result1=employees.stream().findFirst();
	    
	    if  (result1.isPresent())
	    	System.out.println(result1.get());
	    else 
	    	System.out.println("Collection is empty");
	    
	    System.out.println("------------------------------------------");
	    
	    Optional<Employee>result2=employees
	    	                            .stream()
	    	                            .filter((e)->e.getGender()=='F')
	    	                            .findAny();
	    if  (result1.isPresent())
	    	System.out.println(result2.get());
	    else 
	    	System.out.println("No Male Employee Found");
	    System.out.println("------------------------------------------");
	    
	    List<Employee>employeeSortedList;
	    employeeSortedList=employees
	                      .stream()
	                      .sorted((emp1,emp2)->emp1.getAge()-emp2.getAge())
	                      .collect(Collectors.toList());
	    
	    System.out.println(employeeSortedList);
	    System.out.println("------------------------------------------");
	    
	    Consumer<Employee>consumer1=System.out::println;
	    employees.stream().forEach(consumer1);// or 
	    System.out.println("------------------------------------------");
	    employees.stream().forEach(System.out::println);
	    
	    employees
	             .stream()
	             .map(Employee::getBasic)
	             .forEach(System.out::println);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
