package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle = "The lord of the Rings";
		if (bookTitle.contains("Ring")){
			System.out.println("This book contains the word Ring");
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("It's really the famous chrome browser");
		}
		String firstName= "Nourmina";
		String lastName = "Francis";
		String NID = "2870102603337";
		String username = firstName.substring(0,1)+lastName.substring(0,1)+NID.substring(8);
		System.out.println("Your username is "+username);
		System.out.println("Your username length is "+username.length());
	}

}
