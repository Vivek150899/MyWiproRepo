package pack1;

public class Square implements Shape{
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

	public double calculateArea() {
		return this.size*this.size;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.calculateArea();
	}

	
	
	

}
