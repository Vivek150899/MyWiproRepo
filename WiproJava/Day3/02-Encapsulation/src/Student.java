
public class Student {
	
	
	private int mark1;
	private int mark2;
    private int mark3;
	 
	int getMark1() {
		return mark1;
	}

	void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	int getMark2() {
		return mark2;
	}

	void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	int getMark3() {
		return mark3;
	}

	void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	 
	
	
	int getTotal() {
		int total;
		total=(mark1+mark2+mark3);
		return total;
	}
	
	int getAverage() {
		int average;
		average=getTotal()/3;
		return average;
	}
	
	

}
