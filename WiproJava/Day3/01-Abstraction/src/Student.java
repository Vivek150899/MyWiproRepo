
public class Student {
	
	
	int mark1,mark2,mark3;
	int total;
	int average;
	
	
	int getTotal() {
		
		total=(mark1+mark2+mark3);
		return total;
	}
	
	int getAverage() {
		average=total/3;
		return average;
	}
	
	

}
