package pack2;

import pack3.AccountFactory;
import pack3.Account;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A;
		
		A=AccountFactory.createAccount('S');
		//s=new Circle();
		A.deposite(200);
		A.withdraw(500);
		
		
		A=AccountFactory.createAccount('T');
		//s=new Circle();
		A.deposite(40);
		A.withdraw(35);
		
		A=AccountFactory.createAccount('C');
		//s=new Circle();
		A.deposite(40000);
		A.withdraw(35000);

	}

}
