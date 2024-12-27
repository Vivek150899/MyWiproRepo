package pack1;

public class BooleanStack {
	
	boolean []allInts;
	int index;
	
	public BooleanStack(int size) {
		allInts=new boolean[size];
		index=0;
	}
	public void push(boolean value) {
		allInts[index]=value;
		index++;
	}
	public boolean pop() {
		index--;
		boolean value=allInts[index];
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
