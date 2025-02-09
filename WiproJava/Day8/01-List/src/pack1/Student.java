package pack1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	int rollNumber;
	String name;
	Double mark1,mark2;
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
	public Double getMark1() {
		return mark1;
	}
	public void setMark1(Double mark1) {
		this.mark1 = mark1;
	}
	public Double getMark2() {
		return mark2;
	}
	public void setMark2(Double mark2) {
		this.mark2 = mark2;
	}
	@Override
	public String toString() {
		return "\nStudent [rollNumber=" + rollNumber + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mark1, mark2, name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(mark1, other.mark1) && Objects.equals(mark2, other.mark2)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	public double getTotal() {
		return this.mark1+this.mark2;
	}
	public double getAverage() {
		double avg=this.getTotal()/2;
		return avg;
	}
	@Override
	public int compareTo(Student other) {
		if (this.getTotal()<other.getTotal())
			return -1;
		if (this.getTotal()>other.getTotal())
			return 1;
		return 0;
	}
	

}
