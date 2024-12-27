package pack3;

public class StringStackImplementation {
	
	String []allInts;
	int index;
	
	public StringStackImplementation(int size) {
		allInts=new String[size];
		index=0;
	}
	public void push(String value) {
		allInts[index]=value;
		index++;
	}
	public String pop() {
		index--;
		String value=allInts[index];
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
