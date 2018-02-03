package labs;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1 = new Student("12345689",1000);
		Student stud2 = new Student("81723898",2000);
		stud1.setCity("Texas");
		stud1.setPhone("+123456789");
		stud1.setState("Austin");
		stud1.enroll("Mathematics");
		stud1.enroll("Physics");
		System.out.println("The balance of student "+stud1.getEmail()+" is $"+stud1.checkBalance());
		stud1.pay(100);
		stud1.addBalance(1009);
		System.out.println("The current courses student "+stud1.getEmail()+ "is enrolled in are: "+stud1.showCourses());
		
		stud2.setCity("California");
		stud2.setPhone("+987654321");
		stud2.setState("San Diego");
		stud2.enroll("Advanced Computer Engineering");
		stud2.enroll("Statistics");
		System.out.println("The balance of student "+stud1.getEmail()+" is $"+stud2.checkBalance());
		stud2.pay(500);
		stud2.addBalance(1110);
		System.out.println("The current courses student "+stud2.getEmail()+" is enrolled in are: "+stud2.showCourses());
	}

}
