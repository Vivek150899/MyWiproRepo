package pack3;

import pack1.Circle;

public class CircleStackImplementation {
	
	Circle []allInts;
	int index;
	
	public CircleStackImplementation(int size) {
		allInts=new Circle[size];
		index=0;
	}
	public void push(Circle value) {
		allInts[index]=value;
		index++;
	}
	public Circle pop() {
		index--;
		Circle value=allInts[index];
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
