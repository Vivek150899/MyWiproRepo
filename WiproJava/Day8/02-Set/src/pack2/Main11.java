package pack2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import pack1.Student;


public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student>allStudents;
		
		allStudents=new HashSet<>();
		
		allStudents.add(new Student(1,"Achal",15,24));
		allStudents.add(new Student(4,"Arpit",12,23));
		allStudents.add(new Student(3,"Vivek",13,25));
		allStudents.add(new Student(2,"Abhishek",18,23));
		
		for (Student emp:allStudents) {
			System.out.println(emp);
		}
		Iterator<Student>it=allStudents.iterator();
		while(it.hasNext()) {
			Student current=it.next();
			System.out.println(current);
			
		}
        

	}

}
