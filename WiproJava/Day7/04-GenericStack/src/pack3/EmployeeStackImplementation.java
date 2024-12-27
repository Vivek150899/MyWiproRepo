package pack3;

import pack1.Circle;
import pack1.Employee;

public class EmployeeStackImplementation {
	
	Employee []allInts;
	int index;
	
	public EmployeeStackImplementation(int size) {
		allInts=new Employee[size];
		index=0;
	}
	public void push(Employee value) {
		allInts[index]=value;
		index++;
	}
	public Employee pop() {
		index--;
		Employee value=allInts[index];
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
