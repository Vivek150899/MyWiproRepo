package pack2;

import java.util.function.Supplier;

import pack1.Loan;
import pack1.Square;
import pack1.Loan;

public class Main3 {
	
	static void f1(Supplier<Loan> supplier) {
		System.out.println(supplier.get());
	}
	static void f2(Supplier<Square> supplier) {
		Square square=supplier.get();
		System.out.println(square.getSize()+","+square.getArea());
	}

	public static void main(String[] args) {
		Supplier<String>supplier1;
		supplier1=()-> new String("Hello");
		System.out.println(supplier1.get());
		
		Supplier<Double>supplier2;
		supplier2=()-> Double.valueOf(200.00);
		System.out.println(supplier2.get());
		
		Supplier<Square>supplier3;
		supplier3=()-> new Square(10);
		System.out.println(supplier3.get());
		
		Supplier<Loan>supplier4;
		supplier4=()-> new Loan(21,"Achal",12000,11);
		System.out.println(supplier4.get());
		Loan loan=supplier4.get();
		System.out.println(loan.getCustomerName());
		System.out.println(loan.getLoanAmt());
		System.out.println(loan.getTenure());
		f1( ()->new Loan() );
		f1( ()->new Loan(1050, "Aman", 10000.00, 12));
		f2( ()->new Square(20)  );
		
		
		

	}

}
