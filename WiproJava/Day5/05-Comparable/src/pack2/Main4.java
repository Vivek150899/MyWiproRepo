package pack2;

import pack1.Student;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(1,"Arpit",33,24,55);
		Student st2=new Student(1,"Achal",23,45,28);
		
		int res=st1.compareTo(st2);
		System.out.println(res);
		
		if (res<0)
			System.out.println("Arpit got Better marks");
		if (res>0)
			System.out.println("Achal got Better marks");
		if (res==0)
			System.out.println("Both are Equal");

		
				

	}

}
