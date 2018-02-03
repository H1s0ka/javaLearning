package oop;

public class BankAccountApp {
	public static void main(String[] args){
		BankAccount acc1 = new BankAccount();
		
		BankAccount acc2 = new BankAccount("100026101987");
		
		BankAccount acc3 = new BankAccount("100026101987",500000);
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		System.out.println("The Account Number created is "+acc3.accountNumber+" and the initial deposit is $"+acc3.initDeposit);
		acc1.setName("Nourmina Francis");
		acc3.checkBalance();
		
		acc1.setRate(12);
		acc1.increaseRate(0.5);
		
		String msg = acc3.toString();
		System.out.println(msg);
		
		//Creating a CDAccount
		
		CDAccount cd1 = new CDAccount(12.5);
		cd1.compound();
		
		System.out.println("The details of Account 1 is: "+acc1.toString());
		
	}
}
