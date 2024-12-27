package pack3;

public class StackImplementation <T>{
	Object []allInts;
	int index;
	
	public StackImplementation(int size) {
		
		allInts=new Object[size];
		index=0;
	}
	public void push(T value) {
		allInts[index]=value;
		index++;
	}
	public T pop() {
		index--;
		Object value=allInts[index];
		return (T) value;
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
