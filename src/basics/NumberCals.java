package basics;

public class NumberCals {
	public static void main(String[] args){
		System.out.println("Our program is initializing ..."); 
		//declare variables
		int numbA = 20;
		int numbB = 10;
		printName();
		addNumbers(numbA, numbB);
		System.out.println("The product of " + numbA +" and " +numbB + " is "+ multNumbers(numbA,numbB));
	}
	public static void printName(){
		System.out.println("My name is His0ka");
	}
	public static void addNumbers(int valA, int valB){
		System.out.println("The summation of "+valA+" and "+valB+" is "+ (valA+valB));
	}
	public static int multNumbers( int valA, int valB){
		int product = valA*valB;
		return product;
	}
}
