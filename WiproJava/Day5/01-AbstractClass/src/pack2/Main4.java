package pack2;

import pack1.CarLoan;
import pack1.HomeLoan;
import pack1.Loan;
import pack1.PersonalLoan;

public class Main4 {
	
	static void printLoanDetails(Loan loan) {
		if (loan instanceof PersonalLoan) {
			PersonalLoan temp=(PersonalLoan) loan;
			
			
			System.out.println("Personal Loan Amount : "+temp.getInterestAmount());
			System.out.println("Personal Loan Tenure : "+temp.getTenure());
			System.out.println("Personal Loan Interest Rate : "+temp.getInterestRate());
			System.out.println("Personal Loan Repayable : "+temp.getRepayableAmount());
			System.out.println("Personal Loan EMI : "+temp.getEMI());
			System.out.println("Person Contact Number : "+temp.getPhoneNumber());
			System.out.println("   ");
			
		}
		
		if (loan instanceof HomeLoan) {
			HomeLoan temp=(HomeLoan) loan;
			
			System.out.println("Home Loan Amount : "+temp.getInterestAmount());
			System.out.println("Home Loan Tenure : "+temp.getTenure());
			System.out.println("Home Loan Interest Rate : "+temp.getInterestRate());
			System.out.println("Home Loan Repayable : "+temp.getRepayableAmount());
			System.out.println("Home Loan EMI : "+temp.getEMI());
			System.out.println("Property Location : "+temp.getPropertyLocation());
			
			System.out.println("   ");
		}
		
		if (loan instanceof CarLoan) {
			CarLoan temp=(CarLoan) loan;
			
			
			System.out.println("Car Loan Amount : "+temp.getInterestAmount());
			System.out.println("Car Loan Tenure : "+temp.getTenure());
			System.out.println("Car Loan Interest Rate : "+temp.getInterestRate());
			System.out.println("Car Loan Repayable : "+temp.getRepayableAmount());
			System.out.println("Car Loan EMI : "+temp.getEMI());
			System.out.println("Car Resistraction Number : "+temp.getRegNumber());
		}
			
	}

	public static void main(String[] args) {
		
		
Loan loan;
		
		loan=new PersonalLoan(10000.0, 12,"9519382914");
		
	/*	System.out.println("Personal Loan Amount : "+loan.getInterestAmount());
		System.out.println("Personal Loan Tenure : "+loan.getTenure());
		System.out.println("Personal Loan Interest Rate : "+loan.getInterestRate());
		System.out.println("Personal Loan Repayable : "+loan.getRepayableAmount());
		System.out.println("Personal Loan EMI : "+loan.getEMI());*/
		
		printLoanDetails(loan);
		
		loan=new HomeLoan(22000.0, 24,"Lucknow");
		/*System.out.println("Home Loan Amount : "+loan.getInterestAmount());
		System.out.println("Home Loan Tenure : "+loan.getTenure());
		System.out.println("Home Loan Interest Rate : "+loan.getInterestRate());
		System.out.println("Home Loan Repayable : "+loan.getRepayableAmount());
		System.out.println("Home Loan EMI : "+loan.getEMI());*/
		
		printLoanDetails(loan);
		
		loan=new CarLoan(15000.0, 36,"UP 14 K 2632");
	/*	System.out.println("Car Loan Amount : "+loan.getInterestAmount());
		System.out.println("Car Loan Tenure : "+loan.getTenure());
		System.out.println("Car Loan Interest Rate : "+loan.getInterestRate());
		System.out.println("Car Loan Repayable : "+loan.getRepayableAmount());
		System.out.println("Car Loan EMI : "+loan.getEMI());*/
		
		printLoanDetails(loan);

	}

}
