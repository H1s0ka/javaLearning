package labs;

public class Student {
	private static int iD = 1000;
	private String city;
	private String phone;
	private String state;
	private String SSN;
	private String email;
	double balance;
	String[] courses = new String[10];
	private int courseNumbers = 0;
	
	//Constructors
	public Student()
	{}
	public Student(String ssn){
		this.SSN = ssn;
		int rand = (int) ((Math.random())*100);
		System.out.println(rand);
		iD++;
		this.email = iD+""+rand+""+ssn.substring(0,5);
	}
	public Student(String ssn, double balance){
		this.SSN = ssn;
		int rand = (int) ((Math.random())*10000);
		iD++;
		this.email = iD+""+rand+""+ssn.substring(0,4);
		this.balance = balance;
		System.out.println(rand);
	}
	//setters and getters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//Methods
	public void enroll(String course){
		this.courseNumbers = this.courseNumbers + 1;
		System.out.println(this.courseNumbers);
		this.courses[this.courseNumbers-1] = course;
		System.out.println("The course is "+this.courses[this.courseNumbers-1]);
		System.out.println("The user "+email+" has been enrolled in the course "+course);
		System.out.println("The full list of courses of the user "+email+" is "+showCourses());
	}
	public void pay(double payment){
		this.balance = this.balance - payment;
		System.out.println("After you have paid $"+payment+", your current balance is $"+checkBalance());
	}
	public double checkBalance(){
		return this.balance;
	}
	@Override
	public String toString(){
		return "["+email+", "+city+","+state+", "+phone+", "+showCourses()+"]";
	}
	public String showCourses(){
		String msg = "[";
		for(int i = 0 ; i < 100; i++){
			if (this.courses[i]==null){
				break;
			}
			else{
				if(courses[i+1]!=null){
					msg = msg+courses[i]+",";
				}
				else{
					msg = msg+courses[i]+"]";
				}
			}
		}
	return msg;
	}
	public void addBalance(double balance){
		this.balance = this.balance + balance;
		System.out.println("The current balance is "+checkBalance());
	}
}
	

