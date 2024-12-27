package pack3;

public class StackImplementation1<T> implements Stack<T>{
	
	Object []allInts;
	int index;
	
	public StackImplementation1(int size) {
		allInts=new Object[size];
		index=0;
	}

	@Override
	public void push(T obj) {
		// TODO Auto-generated method stub
		allInts[index]=obj;
		index++;
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		index--;
		Object value=allInts[index];
		return (T) value;
	}

}
