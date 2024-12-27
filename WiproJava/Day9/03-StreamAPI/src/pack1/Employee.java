package pack1;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	char gender;
	String city;
	char grade;
	int age;
	double basic;
	public Employee(int id, String name, char gender, String city, char grade, int age, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.grade = grade;
		this.age = age;
		this.basic = basic;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", grade=" + grade
				+ ", age=" + age + ", basic=" + basic + "]";
	}
	
	

}
