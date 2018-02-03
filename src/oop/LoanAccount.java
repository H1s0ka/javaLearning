package oop;

public class LoanAccount implements IRate{

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		System.out.println("Setting Rate");
	}

	@Override
	public void increaseRate(double rateIncrease) {
		// TODO Auto-generated method stub
		System.out.println("Increasing Rate");
	}
	
	public void setTerm(int term){
		System.out.println("The new term is "+term+ " years");
	}
	
	public void setAmmortSchedule(){
		System.out.println("Ammortization schedule");
	}
	
}
