package pack3;

import pack1.Loan;
import pack2.Decider;

public class Main9 {

	public static void main(String[] args) {
		
		String str="Welcome";
		
		Decider<String>decider1;
		decider1=(s)->{return s.length()>10;};
		System.out.println(decider1.decide(str));
		
		Decider<String>decider2;
		decider2=(s)->{return s.length()>5;};
		System.out.println(decider2.decide(str));
		
		Decider<String>decider3;
		decider3=(s)-> s.length()>25;
		System.out.println(decider3.decide(str));
		
		Loan loan=new Loan(1012,"Raman",12000,13);
		
		Decider<Loan> decider4;
		decider4=(l)->l.getLoanAmt()>5000;
		System.out.println(decider4.decide(loan));
		
		Decider<Loan> decider5;
		decider5=(l)->l.getTenure()>=12;
		System.out.println(decider5.decide(loan));
		
	

	}

}
