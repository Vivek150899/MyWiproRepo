package pack2;

import java.util.HashSet;
import java.util.Set;

import pack1.Student;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student>allStudent=new HashSet<>();
		
		allStudent.add(new Student(1,"Aman",12,23));
		allStudent.add(new Student(5,"Ramesh",13,23));
		allStudent.add(new Student(4,"Himansh",15,25));
		allStudent.add(new Student(2,"Vivek",12,27));
		allStudent.add(new Student(3,"Vijay",12,24));
		
		for (Student stud:allStudent) {
			System.out.println(stud);
		}
		
		

	}

}
