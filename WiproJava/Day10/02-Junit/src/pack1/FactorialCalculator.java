package pack1;

public class FactorialCalculator {
	
	private int number;
	 
	public int getNumber() {
		return number;
	}
 
	public void setNumber(int number) throws Exception {
		if(number<0) {
			throw new Exception("Invalid Data");
		}
		this.number = number;
	}
	public long calculate() {
		long result=1;
		for(int i=1; i<=number; i++) {
			result=result*i;
		}
		return result;
	}


}
