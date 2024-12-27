package pack1;

import java.util.Objects;

public class Square {
	private int size;
	//generate two constructors 
	//generate setter and getters 
	//implement computeArea
	//implement toString (generate)
	//implement hashCode and equals 

	public Square(int size) {
		super();
		this.size = size;
	}
	public Square() {
		super();
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Square [getSize()=" + getSize() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(size);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return size == other.size;
	}
	
	public long computeArea() {
		return size*size;
	}
	
	
	

}
