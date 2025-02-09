package pack1;

import java.util.Objects;

public class Square implements Comparable{
	
	private int size;

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

	@Override
	public int compareTo(Object o) {
		Square temp=(Square) o;
		if (temp.size<this.size)
			return 1;
		if (temp.size>this.size)
			return -1;
		return 0;
		
		
	}
	

	

}
