
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        short quantity=20;
        
        
        //byte short int char used as switch statement
        //variables can not be used in case statements
        //Only final variables can be written in case statements
        
        switch(quantity) {
        case 5:  System.out.println("Low Quantity");
                break;
        case 10: System.out.println("Medium Quantity");
                break;
        case 20: System.out.println("High Quantity");
                break;
        default: System.out.println("Can Not Determine");
                break;
        }
	}

}
