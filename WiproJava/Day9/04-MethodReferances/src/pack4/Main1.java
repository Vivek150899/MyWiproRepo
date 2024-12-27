package pack4;

import pack1.Addition;
import pack1.Subtraction;
import pack1.Task;

public class Main1 {

	public static void main(String[] args) {
		Task task;
		task=Addition::add;//method reference for static method 
		System.out.println(task.execute(20, 40));
		
		task=Subtraction::subtract; //method reference for static method 
		System.out.println(task.execute(70, 40));

	}

}
