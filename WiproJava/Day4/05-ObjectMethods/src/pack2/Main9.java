package pack2;
import pack1.Loan;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1=new Loan();
		Loan l2=new Loan();
		Loan l3=new Loan();
		l1.setLoanID(12);
		l1.setLoanAmount(2000);
		l2.setLoanID(12);
		l2.setLoanAmount(3000);
		l3.setLoanID(13);
		l3.setLoanAmount(2000);
		Loan l4=new Loan();
		l4.setLoanID(13);
		l4.setLoanAmount(2000);
		
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		System.out.println(l3.equals(l4));
		

	}

}
