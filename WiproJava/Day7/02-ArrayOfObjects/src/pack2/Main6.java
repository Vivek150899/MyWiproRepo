package pack2;


import pack1.Student;

public class Main6 {

	public static void main(String[] args) {
		// create an arrey of students 
		//initialize elements 
		//print the name ,total
Student[] student=new Student[4];
        
        
		student[0]=new Student(1,"Abhishek",20,30);
		student[1]=new Student(2,"Achal",15,25);
		student[2]=new Student(3,"Arpit",12,24);
		student[3]=new Student(4, "Soumya",50,27);
        
        for (Student i:student) {
        	System.out.println(i);
        	System.out.println(i.getAverage());
        	System.out.println(i.getTotal());
        	System.out.println(i.getRollNumber());
        	System.out.println(i.getMark1());
        	System.out.println(i.getMark2());
        	

	}
	}
}
