package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		//Variables declaration
		String career;
		System.out.println("Program is strating");
		career="Software Developer";
		System.out.println("My career: "+career);
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//compute annual salary
		//rate*hoursPerWeek*WeeksPerYear
		double salary = hoursPerWeek*weeksPerYear*rate;
		System.out.println("My salary as a "+career+ " at the rate of $"+rate+" is $"+salary+" per year");
	}
}
