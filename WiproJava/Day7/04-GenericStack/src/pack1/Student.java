package pack1;

public class Student {
	
	private int rollNumber;
	private String name;
	private double mark1,mark2;
	public Student(int rollNumber, String name, double mark1, double mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public Student() {
		super();
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2 + "]";
	}
	
	public double getTotal(){
    return (mark1+mark2);
		
	}
	public double getAverage(){
	    return (this.getTotal()/2);
			
		}
	
	
	
	//create constructor 
	//getter setter
	//getTotal
	//getAverage

}
