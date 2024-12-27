package pack1;



public class IntStack {
	
	int []allInts;
	int index;
	
	public IntStack(int size) {
		allInts=new int[size];
		index=0;
	}
	public void push(int value) {
		allInts[index]=value;
		index++;
	}
	public int pop() {
		index--;
		int value=allInts[index];
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
