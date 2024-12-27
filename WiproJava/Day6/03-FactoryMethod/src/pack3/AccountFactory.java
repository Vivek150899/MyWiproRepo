package pack3;


public class AccountFactory {
	
	public static Account createAccount(char c) {
		
		Account shape=null;
		if(c=='S')
			shape=new SavingsAccount();
		if(c=='C')
			shape=new CurrentAccount();
		if(c=='T')
			shape=new TradingAccount();
		
		return shape;
		
		}

}
