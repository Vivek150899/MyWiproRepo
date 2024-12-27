package pack4;

import pack3.Circle;
import pack3.Employee;
import pack3.Factory;

public class Main4 {

	public static void main(String[] args) {
		Factory<Circle>factory1;
		factory1=Circle::new;
		//method reference for constructor method 
        Circle c1=factory1.create(5);
        System.out.println(c1);
        
        Factory<Employee>factory2;
		factory2=Employee::new;
		//method reference for constructor method 
        Circle c2=factory1.create(5);
        System.out.println(c2);
        
        
        
	}

}
