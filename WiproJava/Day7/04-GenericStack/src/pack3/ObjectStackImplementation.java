package pack3;

import pack1.Circle;

public class ObjectStackImplementation {
	
	Object []allInts;
	int index;
	
	public ObjectStackImplementation(int size) {
		allInts=new Object[size];
		index=0;
	}
	public void push(Object value) {
		allInts[index]=value;
		index++;
	}
	public Object pop() {
		index--;
		Object value=allInts[index];
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
