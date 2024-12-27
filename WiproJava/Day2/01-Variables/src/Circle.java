
public class Circle {
     static int count;    //global variable
                          //default value 0
     
	int radius=0;  //instance variables 
                    //default value is 0 for local no default value
	/*
	 * for byte  - 0
	 * for short  -0
	 * for int -   0
	 * for long -  0L
	 * for float - 0.00
	 * for double- 0.0D or 0.0
	 * for char -  /0000
	 * boolean  -  false
	 */
	void displayArea() {
		double area;   //local variable
		area=radius*radius*3.14;    //local variable can not be used before initialization
        System.out.println(area);
	}
    void displayDiameter() {
    	int diameter;
    	diameter=2*radius;
    	System.out.println(diameter);
    }
    void f1(int p) {
    	System.out.println(p);
    }
    void f2() {
    	int i=1;
    	
    	while (i<=10) {
    		int xyz=10;
    		System.out.println(i);
    		i++;
    		System.out.println(xyz);// local variable can not be used outside
    	}
    }
    void f3() {
    	for (int i=0;i<=10;i++) {
    		System.out.println(i);
    	}
    }
}
