package oop;

public class BankAccount implements IRate{
	String name;
	String accountNumber;
	static final String routingNumber = "67891234";
	String customerName;
	String NID;
	String accountType;
	double rate = 0;
	
	double initDeposit;
	double withdrawl;
	double balance=0;
	
	//Constructor Overloading
	BankAccount(){
		System.out.println("A new bank account is created");
	}
	BankAccount(String accountNumber){
		System.out.print("A new bank account is created");
		System.out.println(" and the account number is "+accountNumber);
		this.accountNumber = accountNumber;
	}
	BankAccount(String accountNumber, double initDeposit){
		System.out.print("A new bank account is created");
		System.out.println(" and the account number is "+accountNumber+" and has initial deposit of $"+initDeposit);
		this.accountNumber = accountNumber;
		String msg = null;
		if(initDeposit<1000){
			msg = "ERROR: The minimum deposit to open account is $1000";
		}
		else{
			this.initDeposit = initDeposit;
			this.balance = initDeposit+balance;
		}
	}
	BankAccount(String name,String accountNumber, double initDeposit){
		System.out.print("A new bank account is created");
		System.out.println(" and the account number is "+accountNumber+" and has initial deposit of $"+initDeposit);
		this.accountNumber = accountNumber;
		String msg = null;
		if(initDeposit<1000){
			msg = "ERROR: The minimum deposit to open account is $1000";
		}
		else{
			this.initDeposit = initDeposit;
			this.balance = initDeposit+balance;
		}
		this.name = name;
	}

	//setters and getters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//interface methods
	@Override
	public void setRate(double rate) {
		System.out.println("Setting Rate");
		this.rate = rate;
		System.out.println("The new rate set is "+ this.rate+"%");
		
	}
	@Override
	public void increaseRate(double rateIncrease) {
		System.out.println("Increasing Rate for "+this.name);
		this.rate = rateIncrease + this.rate;
		System.out.println("The new rate set is "+ this.rate+"% for "+this.name);
		
	}
	
	void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	private void showActivity(String activity){
		System.out.println("The activity recently done: "+activity);
		System.out.println("Your new balance is $"+balance);
	}
	void checkBalance(){
		System.out.println("The current balance in the account number " + this.accountNumber+" is $"+this.balance);
	}
	
	@Override
	public String toString(){
		return "["+name+","+accountNumber+", "+routingNumber+", "+balance+"]";
	}
}
