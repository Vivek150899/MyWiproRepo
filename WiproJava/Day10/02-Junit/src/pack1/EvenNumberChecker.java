package pack1;

public class EvenNumberChecker {
	
	int number;
	 
	public int getNumber() {
		return number;
	}
 
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isEvenNumber() {
		if(this.number%2==0)
			return true;
		else
			return false;
	}

}
