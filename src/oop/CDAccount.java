package oop;

public class CDAccount extends BankAccount{
	double interestRate;
	
	CDAccount(double interestRate){
		this.interestRate = interestRate;
		System.out.println("A new CDAccount is created with interest rate "+interestRate+"%");
	}
	
	void compound(){
		System.out.println("This account will have a compound interest rate of "+interestRate+ "%");
	}
}
