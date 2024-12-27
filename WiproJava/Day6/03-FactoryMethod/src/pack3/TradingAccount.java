package pack3;

class TradingAccount implements Account{
	private double share=500;
	private String name;
	

	public TradingAccount(double balance) {
		super();
		this.share = balance;
		this.name=name;
	}
	

	public TradingAccount() {
		super();
	}



	public double getBalance() {
		return share;
	}


	public void setBalance(double balance) {
		this.share = balance;
	}


	@Override
	public void deposite(double amt) {
		// TODO Auto-generated method stub
		this.share=this.share+amt;
		System.out.println("Final Share after Deposition is : "+this.share);
		
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		this.share=this.share-amt;
		System.out.println(" Final Share after Withedrawl is : " +this.share);
		
	}
	
	
	

}
