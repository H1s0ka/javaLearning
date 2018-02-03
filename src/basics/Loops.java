package basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] states = {"New York","San Francisco","Miami","Dallas","Texas"};
		String state;
		//do while
		int i = 0;
		do {
			System.out.println("State at "+i+": "+states[i]);
			i++;
		}
		while(i<states.length);
		//while for validating a specific country when met in this case Miami
		boolean stateFound = false;
		int n = 0;
		while (!stateFound && n < states.length){
			state = states[n];
			if (state == "Miami"){
				stateFound = true;
				System.out.println(state + " state is found in this array");
			}
			n++;
		}
		if (!stateFound){
			System.out.println("Miami state was not found");
		}
		//for loop
		for (int x = 0; x < states.length; x++ ){
			System.out.println("State at " + x+": "+states[x]);
		}
	}
}
