package pack2;

import pack1.Student;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create one student object with parametrised constructors
		//print the object
		Student st = new Student(1,"Achal Shukla",23,24,25);
		System.out.println(st);
		
		//create one student object with no argument constructors
		//print the object
		Student st2 = new Student();
		st2.setMark1(20);
		st2.setMark2(24);
		st2.setMark3(45);
		st2.setName("Vivekanand Shukla");
		st2.setRollNumber(12);
		System.out.println(st2);

	}

}
