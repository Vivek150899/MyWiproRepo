package pack3;
import pack1.Loan;
import pack1.Square;
import pack2.Acceptor;
import pack2.Decider;

public class Main10 {
	
	static void f1(Acceptor<Square>acc) {
		Square square=new Square(10);
		acc.accept(square);
	}
	
	static void f2(Decider<Loan> decider) {
		Loan loan=new Loan(1012,"Arpit",12345.0,12);
		System.out.println(decider.decide(loan));
		
	}

	public static void main(String[] args) {
		Acceptor<Square> acceptor1;
		acceptor1=(s)->System.out.println(s.getSize());
		f1(acceptor1);//functional programming
		
		Acceptor<Square> acceptor2;
		acceptor2=(s)->System.out.println(s.getArea());
		f1(acceptor2);
		
		f1((s)->System.out.println(s.getArea()));
		
		f1((s)->System.out.println(s.getSize()));
		
		f1((s)->System.out.println(s));
		
		f2((l)->l.getLoanAmt()>5000);
		
		f2((l)->l.getTenure()>5);
		
		
		
		

	}

}
