public class Circle {
	
	private int radius;
	static final double PI=3.14;
	
	
	int getRadius() {
		return this.radius;
	}
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return PI*this.radius*this.radius;
	}
	
	
	

}
