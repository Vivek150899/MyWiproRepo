package pack1;

public class FloatStack {
	
	float []allInts;
	int index;
	
	public FloatStack(int size) {
		allInts=new float[size];
		index=0;
	}
	public void push(float value) {
		allInts[index]=value;
		index++;
	}
	public float pop() {
		index--;
		float value=allInts[index];
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
