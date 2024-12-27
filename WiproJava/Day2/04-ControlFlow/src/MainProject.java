
public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int quantity=12;
        double listPrice=35.0;
        float discountPercentage;
        double value=(quantity * listPrice);
        double discountedValue;
        double finalValue;
        
        if (quantity >100) {
        	
        	discountPercentage=60.0f;
        	
        	
        }else if (quantity >80) {
        	discountPercentage=50.0f;
        	
        	
        }else if (quantity >40) {
        	discountPercentage=30.0f;
        	
        	
        }else if (quantity >20) {
        	discountPercentage=5.0f;
        	
        	
        }else {
        	discountPercentage=0.0f;
        	
        }
        discountedValue=((discountPercentage/100)*value);
        finalValue=value-discountedValue;
        System.out.println("quantity : "+ quantity);
        System.out.println("Listed Price : "+ listPrice);
        System.out.println("Value : "+ value);
        System.out.println("discounted Value : "+ discountedValue);
        System.out.println("final Value : "+ finalValue);
        
	}

}
/*
 * if quantity >100 , discountPercentage=60
 * if quantity >80 , discountPercentage=50
 * if quantity >40 , discountPercentage=30
 * if quantity >20 , discountPercentage=5
 * if quantity <20 , discountPercentage=0
 * 
 * 
 * print the quantity
 * print the price
 * print the value (quantity*price)
 * print the discounted value
 * 
 */
