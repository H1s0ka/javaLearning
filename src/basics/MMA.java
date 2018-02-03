package basics;

public class MMA {
	public static void main(String[] args){
		//declaring array of integers
		int[] calc = {100,1500,1200,68,19,30,98,1400,1984};
		System.out.println("This is the array of integers available");
		for (int i = 0 ; i < calc.length ; i++){
			System.out.print(calc[i]+"\t");
		}
		System.out.println("\nThe maximum of the above array is: "+max(calc));
		System.out.println("The minimum of the above array is: "+min(calc));
		System.out.println("The average of the above array is: "+avg(calc));
	}
	public static int max(int[] n){
		int maximum = n[0];
		for (int i = 1; i< n.length;i++){
			if (n[i]> maximum){
				maximum = n[i];
			}
		}
		return maximum;
	}
	public static int min(int[] n){
		int minimum = n[0];
		for (int i = 1; i< n.length;i++){
			if (n[i]< minimum){
				minimum = n[i];
			}
		}
		return minimum;
	}
	public static double avg(int[] n){
		double sum = 0;
		for (int i = 0 ; i < n.length; i++){
			sum=sum+n[i];
		}
		return (sum/(n.length));
	}

}
