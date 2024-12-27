
public class Square {

	
	private int size;
	
	 void setSize(int size) {
    	 if (size<0) {
    		 System.out.println("Invalid Size");
    	 }
    	 else
    		 this.size=size;
     }
     int getSize() {
    	 return this.size;
     }
	int computeArea() {
		int area=size*size;
		return area;
	}
}
