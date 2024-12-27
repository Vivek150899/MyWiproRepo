package pack2;

import pack1.Student;
import pack3.StudentStackImplementation;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student e1=new Student(1020,"Ram",12,24);
		Student e2=new Student(1021,"Raman",13,24);
		
		
		StudentStackImplementation stack;
		stack=new StudentStackImplementation(4);
	     
		
		stack.push(e1);
		stack.push(e2);
		
		stack.push(new Student(1022,"Arpit",12,22));
		stack.push(new Student( 1022,"Achal",23,34));
		
		System.out.println(stack);
		
		Student poppedStudent=stack.pop();
		System.out.println(poppedStudent.getRollNumber());
		System.out.println(poppedStudent.getAverage());
		System.out.println(poppedStudent.getTotal());
		System.out.println(poppedStudent.getMark1());
		System.out.println(poppedStudent.getMark2());
		
		poppedStudent=stack.pop();
		System.out.println(poppedStudent.getRollNumber());
		System.out.println(poppedStudent.getAverage());
		System.out.println(poppedStudent.getTotal());
		System.out.println(poppedStudent.getMark1());
		System.out.println(poppedStudent.getMark2());
		
		poppedStudent=stack.pop();
		System.out.println(poppedStudent.getRollNumber());
		System.out.println(poppedStudent.getAverage());
		System.out.println(poppedStudent.getTotal());
		System.out.println(poppedStudent.getMark1());
		System.out.println(poppedStudent.getMark2());
		
		poppedStudent=stack.pop();
		System.out.println(poppedStudent.getRollNumber());
		System.out.println(poppedStudent.getAverage());
		System.out.println(poppedStudent.getTotal());
		System.out.println(poppedStudent.getMark1());
		System.out.println(poppedStudent.getMark2());
		
		
		
		System.out.println(stack);

	}

}
