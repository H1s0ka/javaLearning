package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+ " is walking");
	}
	void eat(){
		System.out.println(name+ " is eating");
	}
	void sleep(){
		System.out.println(name+ " is sleeping");
	}
} 

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person nour = new Person();
		nour.name = "Nourmina";
		nour.email = "eng.nourmina@gmail.com";
		nour.phone = "01002134134";
		
		nour.walk();
		nour.eat();
		nour.sleep();
	}

}
