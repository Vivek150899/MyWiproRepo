package pack3;

class CurrentAccount implements Account{
	
	private double balance=120000;
	

	public CurrentAccount(int balance) {
		super();
		this.balance = balance;
	}
	

	public CurrentAccount() {
		super();
	}
    
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
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
