package pack1;

public class Circle {
	private final int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	

	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}





	public double getRadius() {
		return radius;
	}

	public Circle convert() {
		Circle temp=new Circle(radius*2);
		return temp;
		
	
	}

}
//design this class as immutable class
