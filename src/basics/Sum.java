package basics;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int sum;
		sum = sumN(n);
		System.out.println("The summation from 1 to "+n+ " is "+sum);
	}
	public static int sumN(int n){
		int sum= 0;
		for (int i=1; i<=n; i++ ){
			sum=sum+i;
		}
		return sum;
	}

}
