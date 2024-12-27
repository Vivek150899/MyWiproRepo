package pack1;

public class LongStack {
	
	long []allInts;
	int index;
	
	public LongStack(int size) {
		allInts=new long[size];
		index=0;
	}
	public void push(long value) {
		allInts[index]=value;
		index++;
	}
	public long pop() {
		index--;
		long value=allInts[index];
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
