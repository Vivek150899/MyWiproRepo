package pack1;

public class Employee implements Comparable{
	private int id;
	private String name;
	private double basicSalary;
	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public int compareTo(Object o) {
		Employee oth=(Employee) o;
		if (this.basicSalary<oth.basicSalary)
			return -1;
		if (this.basicSalary>oth.basicSalary)
			return 1;
		return 0;
	}
	
	

}
