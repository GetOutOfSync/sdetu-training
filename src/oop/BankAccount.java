package oop;

public class BankAccount {
	//Define variables
	String accountNumber;
	//Static belongs to the CLASS not the object instance
	//final constant
	static final String routingNumber = "65534";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// Default Constructor
	BankAccount() {
		System.out.println("New Account Created");
	}
	// Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		}
		else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	//Methods
	public void deposit() {
		
	}
	
	public void withdraw() {
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void getStatus() {
		
	}
	
	private void showActivity() {
		System.out.println("Show recent activity");
	}
	
	@Override
	public String toString() {
		return "[" + name + ". " + accountNumber + ". BALANCE: $" + balance + " }";
	}
}
