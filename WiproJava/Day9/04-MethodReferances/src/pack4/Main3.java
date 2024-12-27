package pack4;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class Main3 {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("Prabhu");
		names.add("Shruthi");
		names.add("Karthik");
		names.add("Arghi");
		
		Function <String,Integer>function;
		function=String::length;//method reference for instance method in same type of object
		
		names
		.stream()
		.map(function).
		forEach((n)->System.out.println(n));
		
		
	}
}
