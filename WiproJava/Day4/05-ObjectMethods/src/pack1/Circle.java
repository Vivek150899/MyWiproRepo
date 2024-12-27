package pack1;

public class Circle{
	public int radius;
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	


	public Circle() {
		super();
	}



	@Override
	public String toString() {
		return "Wipro";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (! (obj instanceof Circle)) {
			return false;
		}
		else {
		Circle temp=(Circle)obj;
		if (this.radius==temp.radius) {
			return true;
		}
		else {
			return false;
		}
		
		
	}   
    
	}
	@Override
	public int hashCode(){
		return radius*2;
	}

}
