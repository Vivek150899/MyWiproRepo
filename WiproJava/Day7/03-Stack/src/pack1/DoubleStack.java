package pack1;

public class DoubleStack {
	
	double []allInts;
	int index;
	
	public DoubleStack(int size) {
		allInts=new double[size];
		index=0;
	}
	public void push(double value) {
		allInts[index]=value;
		index++;
	}
	public double pop() {
		index--;
		double value=allInts[index];
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
