package basics;

public class Cities {

	public static void main(String[] args) {
		String[] states = {"New York","San Francisco","Miami","Dallas","Texas"};
		//print San Francisco and Miami
		System.out.println("My favourite states are "+ states[1]+" and "+states[2]);
		String[] cities = new String[3];
		//declaring cities
		cities[0] = "California";
		cities[1]="Ohio";
		cities[2] = "New Jersey";
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Egypt";
		//printing some cities and countries
		System.out.println("The loveliest city is "+cities[1]+ " from "+cities.length+" cities");
		System.out.println("I live in "+countries[2]);
	}
}
