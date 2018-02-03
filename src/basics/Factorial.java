package basics;

public class Factorial {

	public static void main(String[] args) {
		int numA = 3;
		int fact = factorial(numA);
		System.out.println("The factorial of "+numA+ " is "+fact);
	}
	public static int factorial(int n){
		if (n==0) {return 1;}
		else if (n==1){return 1;}
		else {return n*factorial(n-1);}
	}
}
