package pack1;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double basic;
	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(basic, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(basic) == Double.doubleToLongBits(other.basic) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	public double getNetSalary() {
		return this.basic+(this.basic*0.35);
	}
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		if (this.basic<other.basic)
			return -1;
		if (this.basic>other.basic)
			return 1;
	    return 0;
	}
	

}
