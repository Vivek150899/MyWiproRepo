package pack1;

public class Student implements Comparable{
	private int rolNo;
	private String name;
	private int mark1,mark2,mark3;
	public Student(int rolNo, String name, int mark1, int mark2, int mark3) {
		super();
		this.rolNo = rolNo;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public Student() {
		super();
	}
	public int getRolNo() {
		return rolNo;
	}
	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	
	public int getTotal() {
		return this.mark1+this.mark2+this.mark3;
	}
/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student st=(Student) o;
		if (this.getTotal()>st.getTotal())
			return -1;
		if (this.getTotal()<st.getTotal())
			return 1;
		return 0;
	}*/
	@Override
	public int compareTo(Object o) {
	    Student st=(Student) o;
		int s=this.name.compareTo(st.name);
		return s;
	}
}
