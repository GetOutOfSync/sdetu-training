package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("Program is starting");
		career = "Software Engineer";
		System.out.println("My career: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		//Annual Salary Calculator
		//rate * hoursPerWeek * weeksPerYear
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
	}
}
