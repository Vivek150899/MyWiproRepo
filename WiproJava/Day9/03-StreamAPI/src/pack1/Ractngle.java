package pack1;

import java.util.Objects;

public class Ractngle {
	
	private int height,width;

	public Ractngle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Ractngle() {
		super();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ractngle other = (Ractngle) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public String toString() {
		return "Ractngle [height=" + height + ", width=" + width + "]";
	}
	
	

}
