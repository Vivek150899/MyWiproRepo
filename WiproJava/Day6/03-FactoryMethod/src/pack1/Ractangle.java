package pack1;

public class Ractangle implements Shape{
	private int height,width;

	public Ractangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Ractangle() {
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
	public double computeArea() {
		return this.width*this.height;
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		this.setWidth(size);
		this.setHeight(size*2);
		
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.computeArea();
	}

}
