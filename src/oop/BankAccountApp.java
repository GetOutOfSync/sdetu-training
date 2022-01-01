package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "1";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		BankAccount acc2 = new BankAccount("Checking Account");
		acc1.accountNumber = "2";
		BankAccount acc3 = new BankAccount("Checking Account", 100);
		acc1.accountNumber = "3";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Nome";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
	}

}
