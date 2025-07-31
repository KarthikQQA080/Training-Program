package week2;

public class BankAccount {

	/*
	 * Question: Bank Account Constructor Create a class BankAccount with fields:
	 * accountNumber, holderName, balance Add parameterized constructor to
	 * initialize the object Use this keyword where applicable
	 */

	// creating three variables (accountNumber, holderName and balance)
	int accountNumber;
	String holderName;
	double balance;

	// Created parameterized constructor
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		System.out.println("Balance added successfully in " + holderName + "'s Bank account");
	}

	public static void main(String[] args) {
		// creating a object and adding data
		BankAccount user1 = new BankAccount(123456121, "Raju", 10000.54);
		BankAccount user2 = new BankAccount(123456122, "Teja", 1863.67);

		// Printing user1 balance and name
		System.out.println("Available balance in " + user1.holderName + "'s account: " + user1.balance);
		// Printing user2 balance and name
		System.out.println("Available balance in " + user2.holderName + "'s account: " + user2.balance);

	}

}
