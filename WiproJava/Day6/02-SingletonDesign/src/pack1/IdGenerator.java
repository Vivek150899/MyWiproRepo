package pack1;

public class IdGenerator {
	int i;
	//Singleton Design
	public int getNextId() {
		return ++i;
	}
	
	private IdGenerator() {
		
	}
	static IdGenerator instance=null;
	
	public static IdGenerator getInstance(){
		if (instance==null)
			instance=new IdGenerator();
		return instance;
	}

}
