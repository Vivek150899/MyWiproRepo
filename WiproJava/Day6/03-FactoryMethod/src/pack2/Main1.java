package pack2;



import pack1.Shape;
import pack1.ShapeFactory;




public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		
		s=ShapeFactory.createShape('C');
		//s=new Circle();
		s.setSize(20);
		System.out.println(s.getArea());
		
		s=ShapeFactory.createShape('S');
		//s=new Square();
		s.setSize(12);
		System.out.println(s.getArea());
		
		s=ShapeFactory.createShape('R');
		//s=new Ractangle();  there is no need of creating object 
		s.setSize(10);
		System.out.println(s.getArea());
	}

}


