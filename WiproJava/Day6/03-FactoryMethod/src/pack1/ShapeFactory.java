package pack1;

public class ShapeFactory {
	
	public static Shape createShape(char c) {
	
	Shape shape=null;
	if(c=='S')
		shape=new Square();
	if(c=='C')
		shape=new Circle();
	if(c=='R')
		shape=new Ractangle();
	
	return shape;
	
	}

}
