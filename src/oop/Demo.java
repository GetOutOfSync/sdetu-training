package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Definition
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "123456789";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
	}

}


