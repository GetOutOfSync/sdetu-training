package database;

public class Student {
	private String name;
	private String ssn;
	private String studentID;
	private String email;
	private String phone;
	private String city;
	private String state;
	
	private double balance;
	private String[] courses = new String[]{"Biology", "Chemistry", "Algebra"};
	
	private static int schoolID = 3771;
	
	Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		enroll(name, ssn);
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll(String name, String ssn) {
		this.email = name + "@usaschools.edu";
		int max = 9000;
		int min = 1000;
		int randomID = (int)Math.floor(Math.random()*(max-min+1)+min);
		this.studentID = randomID + ssn.substring(ssn.length() - 4);
		System.out.println("User email: " + this.email);
		System.out.println("User ID: " + this.studentID);
	}
	
	public void pay(double value) {
		balance = balance - value;
		System.out.println("Transactions Successful!");
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your Current Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(this.name + "'s Courses");
		for (int i = 0; i < this.courses.length; i++) {
			System.out.println(i + ": " + this.courses[i]);
		}
	}
	
	public String toString() {
		return "[" + schoolID + "." + this.studentID + "." + this.name + "]";
	}
}
