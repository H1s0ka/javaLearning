package basics;

public class Weather {
	public static void main(String[] args){
		int temp = 50;
		String sunCondition = "sunny";
		
		//Computing the suggestion
		if (temp >= 50 && sunCondition == "sunny"){
			System.out.println("The weather is hot and sunny, try to wear something light, or better stay in the AC");
		}
		else if (temp >= 40 && sunCondition == "sunny"){
			System.out.println("The weather is still hot but bearable, get yourself a hat too");
		}
		else if (temp >=30 && sunCondition == "sunny"){
			System.out.println("The weather is little bit cold, wear sleeves and jeans");
		}
		else{
			System.out.println("Get your self a sweater");
		}
	}
}
