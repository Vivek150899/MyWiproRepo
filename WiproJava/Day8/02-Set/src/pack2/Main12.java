package pack2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


import pack1.Student;
import pack1.StudentNameAscendingComprator;
import pack1.StudentNameDescendingComperator;
import pack1.StudentRollNumberAscendingComparator;
import pack1.StudentRollNumberDescendingComperator;

public class Main12 {

	public static void main(String[] args) {
		// create comparator
		//treeset of students with comp objects
		//add few5 student objects
		//print the collection
		Set<Student>allStudents;
		Comparator<Student> st1=new StudentNameAscendingComprator();
		Comparator<Student> st2=new StudentRollNumberAscendingComparator();
		Comparator<Student> st3=new StudentNameDescendingComperator();
		Comparator<Student> st4=new StudentRollNumberDescendingComperator();
		
		System.out.println("\nTotal Marks Order Starts Here:");
		allStudents=new TreeSet<>();
		allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Raman",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Nitesh",18,23));
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		
		System.out.println("\nName Ascending Order Starts Here:");
        allStudents=new TreeSet<>(st1);
        allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Raman",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Nitesh",18,23));
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		
		System.out.println("\nRoll Number Ascending Order Starts Here:");
        allStudents=new TreeSet<>(st2);
        allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Raman",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Nitesh",18,23));
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		
		System.out.println("\nName Descending Order Starts Here:");
        allStudents=new TreeSet<>(st3);
        allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Raman",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Nitesh",18,23));
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		
		System.out.println("\nRoll number Descending Order Starts Here:");
        allStudents=new TreeSet<>(st4);
        allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Raman",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Nitesh",18,23));
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		
		

	}

}
