package pack2;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ages=new LinkedList<>();
		ages.add(Integer.valueOf(25));
		ages.add(Integer.valueOf(40));
		ages.add(Integer.valueOf(50));
		ages.add(Integer.valueOf(35));
		
		Consumer<Integer> consumer;
		consumer=(i)->System.out.println(i);
		
		ages.stream().forEach(consumer);
		//or 
		ages.stream().forEach(i->System.out.println(i));
		System.out.println("-------------------------------");
		ages.stream().filter(i->  i>30 ).forEach(i->System.out.println(i));;
		System.out.println("-------------------------------");
		ages.stream().sorted().forEach(consumer);//or for each upper one 
		System.out.println("-------------------------------");
		ages.stream().sorted().filter(i->i>30).forEach(consumer);
		System.out.println("-------------------------------");
		ages.forEach(consumer);
		
		
		
		//List of String Object 
		//Ass 5 string  Object 
		//Print all the elements 
		//Filter String object whose length is <4 and print
		//sort the string abject  Filter String object whose length is <4 and print
		
		List<String>str=new LinkedList<>();
		str.add("Techademy");
		str.add("Joy");
		str.add("Wipro");
		str.add("Aman");
		str.add("Welcome");
		
		Consumer<String> name;
		System.out.println("-------------------------------");
		name=(i)->System.out.println(i);
		System.out.println("-------------------------------");
		
		str.stream().forEach(name);
		//or 
		str.stream().forEach(i->System.out.println(i));
		System.out.println("-------------------------------");
		str.stream().filter(i-> i.length()<4 ).forEach(i->System.out.println(i));;
		System.out.println("-------------------------------");
		str.stream().sorted().forEach(name);//or for each upper one 
		System.out.println("-------------------------------");
		str.stream().sorted().filter(i-> i.length()<4 ).forEach(name);
	}

}
