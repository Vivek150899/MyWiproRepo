package pack2;

import java.util.function.Consumer;

import pack1.Loan;
import pack1.Square;

public class Main1 {
	
	
	static void f1(Consumer<Square>cons) {
		Square square=new Square(5);
		cons.accept(square);
	}
	
	static void f2(Consumer<Loan>loan) {
		Loan l=new Loan(11,"Achal",1000.0,12);
		loan.accept(l);
	}
  public static void main(String[] args) {
	Square square=new Square(25);
	
	Consumer<Square>consumer1=(s)->System.out.println(s);
	consumer1.accept(square);
	
	Consumer<Square>consumer2=(s)->System.out.println(s.getSize());
	consumer2.accept(square);
	
	Consumer<Square>consumer3=(s)->System.out.println(s.getArea());
	consumer3.accept(square);
	
	Loan loan =new Loan(1012,"Rakesh",1200.0,12);
	Consumer<Loan>consumer4=(s)->System.out.println(s);
	consumer4.accept(loan);
	
	Consumer<Loan>consumer5=(s)->System.out.println(s.getCustomerName());
	consumer5.accept(loan);
	
	Consumer<Loan>consumer6=(s)->System.out.println(s.getLoanAmt());
	consumer6.accept(loan);
	
	Consumer<Loan>consumer7=(s)->System.out.println(s.getLoanId());
	consumer7.accept(loan);
	
	Consumer<Loan>consumer8=(s)->System.out.println(s.getTenure());
	consumer8.accept(loan);
	
	f1((s)->System.out.println(s));
	f1((s)->System.out.println(s.getSize()));
	f1((s)->System.out.println(s.getArea()));
	
	f2((l)->System.out.println(l));
	f2((l)->System.out.println(l.getCustomerName()));
	f2((l)->System.out.println(l.getLoanAmt()));
	f2((l)->System.out.println(l.getLoanId()));
	f2((l)->System.out.println(l.getTenure()));
	
	
	
}

}
