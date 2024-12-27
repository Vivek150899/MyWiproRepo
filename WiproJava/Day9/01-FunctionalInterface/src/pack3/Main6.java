package pack3;

import pack1.Loan;
import pack2.Acceptor;

public class Main6 {

	public static void main(String[] args) {
		Loan laon=new Loan(1055,"Ram",10000,12);
		
		Acceptor<Loan>acceptor1=(loan)->System.out.println(loan.getLoanId());
        acceptor1.accept(laon);
        
        Acceptor<Loan>acceptor2=(loan)->System.out.println(loan.getCustomerName());
        acceptor2.accept(laon);
        
        Acceptor<Loan>acceptor3=(loan)->System.out.println(loan.getLoanAmt());
        acceptor3.accept(laon);
        
        Acceptor<Loan>acceptor4=(loan)->System.out.println(loan.getTenure());
        acceptor4.accept(laon);
        
        
	}

}
