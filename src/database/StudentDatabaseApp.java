package database;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("John", "512199447");
		student1.showCourses();
		System.out.println(student1.toString());
	}

}


