package pack1;

public class Ractangle {
	private final int length,height;

	public Ractangle(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ractangle [length=" + length + ", height=" + height + "]";
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
	public Ractangle enlerge() {
		Ractangle temp=new Ractangle(length*2, height*2);
		return temp;
		//this.length=this.length*2;
		//this.height=this.height*2;
	}
	
	
}

//for final variable setter will not be incluse because cunstructor has always 
