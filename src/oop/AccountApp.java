package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la = new LoanAccount();
		
		la.setTerm(20);
		
		la.setAmmortSchedule();
		
		la.setRate(10);
		
		la.increaseRate(1);
		
		IRate laI = new LoanAccount();
		
		laI.setRate(10);

	}

}
