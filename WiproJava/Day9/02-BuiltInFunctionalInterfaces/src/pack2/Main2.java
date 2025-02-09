package pack2;


import java.util.function.Predicate;

import pack1.Loan;
import pack1.Square;

public class Main2 {
	
	static void f1(Predicate<Square>predicate,Square sq) {
		System.out.println(predicate.test(sq));
	}
	
	static void f2(Predicate<Loan>predicate,Loan loan) {
		System.out.println(predicate.test(loan));
	}
	

	public static void main(String[] args) {
		
		Integer iobj=Integer.valueOf(200);
				
		Predicate<Integer>pr1;
		pr1=(i)->i>100;
		System.out.println(pr1.test(iobj));
		
		String str="Welcome";
		Predicate<String>pr2;
		pr2=(i)->i.length()>50;
		System.out.println(pr2.test(str));
		
		Loan loan=new Loan(21,"Achal",12000,11);
		Predicate<Loan>pr3;
		pr3=(l)->l.getLoanId()>10;
		System.out.println(pr3.test(loan));
		
		Square square=new Square(11);
		Predicate<Square>pr4;
		pr4=(s)->s.getSize()>10;
		System.out.println(pr4.test(square));
		
		f1((s)->s.getSize()>50,square);
		f1((s)->s.getSize()>250,square);
		
		
		f2((s)->s.getLoanAmt()>10000,loan);
		f2((s)->s.getLoanId()!=0,loan);
		f2((s)->s.getTenure()>12,loan);
		f2((s)->s.getCustomerName().length()>10,loan);
		
		
		
 
		
		
		

	}

}
