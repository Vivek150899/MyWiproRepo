package pack1;

public class Circle implements Shape{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return 3.14*this.radius*this.radius;
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		this.setRadius(size);
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double r=this.computeArea();
		return r;
	}

}
