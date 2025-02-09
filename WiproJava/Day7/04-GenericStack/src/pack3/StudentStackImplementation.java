package pack3;

import pack1.Employee;
import pack1.Student;

public class StudentStackImplementation {
	
	Student []allInts;
	int index;
	
	public StudentStackImplementation(int size) {
		allInts=new Student[size];
		index=0;
	}
	public void push(Student value) {
		allInts[index]=value;
		index++;
	}
	public Student pop() {
		index--;
		Student value=allInts[index];
		return value;
	}
	public String toString() {
		String str="[";
		for (int i=0;i<index;i++) {
			if(i==index-1)
				str=str+allInts[i];
			else
			str=str+allInts[i]+",";
		}
		str=str+"]";
		return str;
	}

}
