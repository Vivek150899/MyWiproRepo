package pack2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import pack1.Student;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>studentList;
		studentList=new LinkedList<>();
		
		Student student1=new Student(1,"Achal",12,23);
		Student student2=new Student(2,"Arpit",13,22);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(new Student(3,"Abhishek",14,24));
		studentList.add(new Student(4,"Aman",15,20));
		studentList.add(new Student(5,"Sunil",16,22));
		
		System.out.println(studentList);
		
		double t1,t2=0;
		
		
		
		
		for (Student emp:studentList) {
			System.out.println("\nName of Student : "+emp.getName());
			System.out.println("Total marks of Students : "+emp.getTotal());
			System.out.println( "Average of all marks : "+emp.getAverage());
			t1=emp.getTotal();
			if (t2>t1) {
				continue;
			}else {
				t2=t1;
			}
		}
		
		
		System.out.println("\nHighest marks of student  are : "+t2);
		
		
        Iterator<Student> it=studentList.iterator();
		
		double highTotal=0.0;
		String topStudent = " ";
		
		while(it.hasNext()) {
			Student current =it.next();
			if(current.getTotal()>highTotal) {
				highTotal=current.getTotal();
				topStudent=current.getName();
			}
		}
		
		System.out.println("Student with Highest total marks is :"+topStudent);

	}

	}


