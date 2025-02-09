package pack3;

import pack1.Loan;
import pack2.Acceptor;

public class Main2 {

	public static void main(String[] args) {

		Loan loan = new Loan(101, "Achal", 1000.0, 10);
		Acceptor<Loan> acceptor1;

		acceptor1 = new Acceptor<Loan>() {

			@Override
			public void accept(Loan obj) {
				System.out.println(obj.getLoanId());

			}
		};
		acceptor1.accept(loan);

		Acceptor<Loan> acceptor2;
		acceptor2 = new Acceptor<Loan>() {

			@Override
			public void accept(Loan obj) {
				System.out.println(obj.getCustomerName());

			}

		};
		acceptor2.accept(loan);

		Acceptor<Loan> acceptor3;
		acceptor3 = new Acceptor<Loan>() {

			@Override
			public void accept(Loan obj) {
				System.out.println(obj.getLoanAmt());

			}

		};
		acceptor3.accept(loan);

		Acceptor<Loan> acceptor4;
		acceptor4 = new Acceptor<Loan>() {

			@Override
			public void accept(Loan obj) {
				System.out.println(obj.getTenure());

			}

		};
		acceptor4.accept(loan);
		
		Acceptor<Loan> acceptor5;
		acceptor5 = new Acceptor<Loan>() {

			@Override
			public void accept(Loan obj) {
				System.out.println(obj);

			}

		};
		acceptor5.accept(loan);

	}

}
