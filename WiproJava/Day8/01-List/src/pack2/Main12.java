package pack2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


import pack1.Student;
import pack1.StudentNameAscendingComprator;
import pack1.StudentRollNumberAscendingComparator;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Student> allStudents=new LinkedList<>();
			
	allStudents.add(new Student(1,"Achal",15,24));
	allStudents.add(new Student(4,"Arpit",12,23));
	allStudents.add(new Student(3,"Vivek",13,25));
	allStudents.add(new Student(2,"Abhishek",18,23));
			
			System.out.println(allStudents);
			Comparator<Student> st=new StudentRollNumberAscendingComparator();
			Comparator<Student> st1=new StudentNameAscendingComprator();
			
			Collections.sort(allStudents);
			System.out.println(allStudents);
			
			
			Collections.sort(allStudents,st);
			System.out.println(allStudents);
			
			
			Collections.sort(allStudents,st1);
			System.out.println(allStudents);

		}

	}


