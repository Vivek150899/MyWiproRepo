package pack3;

public class IntegerStackImplementation {
	Integer []allInts;
	int index;
	
	public IntegerStackImplementation(int size) {
		allInts=new Integer[size];
		index=0;
	}
	public void push(Integer value) {
		allInts[index]=value;
		index++;
	}
	public Integer pop() {
		index--;
		Integer value=allInts[index];
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