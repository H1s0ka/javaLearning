package basics;

public class Fabonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a program to calculate Fibonnaci Number");
		System.out.println("Program is initializing ...");
		int fibNum = 10;
		int fibCalc;
		fibCalc = fib(fibNum);
		System.out.println("The Fibaonnaci calculation for "+fibNum+ " is "+fibCalc);
	}
	
	public static int fib(int n){
		if (n==0){
			return 0;
		}
		else if (n==1){
			return 1;
		}
		else{
			return (fib(n-1)+fib(n-2));
		}
	}

}
