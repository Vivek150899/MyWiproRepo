package pack3;

class SavingsAccount implements Account{

   private double balance=5000;
	private String name;
	


	public SavingsAccount(double balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
	

	public SavingsAccount() {
		super();
	}
	


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void deposite(double amt) {
		// TODO Auto-generated method stub
		this.balance=this.balance+amt;
		System.out.println(" Final Balance after Deposite is : "  +this.balance);
		
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		this.balance=this.balance-amt;
		System.out.println(" Final Balance after Withdrawl is : "  +this.balance);
	}
	

}
