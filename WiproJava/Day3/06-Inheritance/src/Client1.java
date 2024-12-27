
public class Client1 {

	public static void main(String[] args) {
		
        Loan l1 =new Loan("Anu",1000.00,5.0f,12);
        System.out.println(l1.computeInterst());
        
        PersonalLoan l2=new PersonalLoan();
        l2.setCustomerName("Vivekanand Shukla");
        l2.setLoanAmount(2000.00);
        l2.setInterestRate(6.0f);
        l2.setDuration(20);
        l2.setMinLimit(1000.0);
        l2.setMaxLimit(10000.0);
        
        
        System.out.println(l2.computeInterst());
        System.out.println(l2.getMinLimit());
        System.out.println(l2.getMaxLimit());
        
        HomeLoan l3=new HomeLoan("Achal" , 50000.0 , 8.0f , 12 , "Mumbai" ); 
        	System.out.println(l3.computeInterst());
            System.out.println(l3.getPropertyLocation());
        	
        	
        }
	}


