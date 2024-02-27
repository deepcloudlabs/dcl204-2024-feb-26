package com.example.banking.domain;
// OOP: i) Class/Object -> Encapsulation + Information Hiding Principle
//         Modeling/Abstraction
//         Domain Class
public class Account extends Object {
	// members: attributes, methods
	// attributes: iban, balance
	// instance variable -> iban
	private final String iban; // hidden?
	// instance variable -> balance
	private double balance; // hidden?
	// methods: constructor, getter, withdraw, deposit

	// overloading
	public Account(String iban) { // constructor #1
		this.iban = iban;
		this.balance = 0.0;
	}

	// overloading
	public Account(String iban, double balance) { // constructor #2
		this.iban = iban;
		this.balance = balance;
	}

	public String getIban() {
		return this.iban;
	}

	public double getBalance() {
		return this.balance;
	}
	
	// business method
	public boolean deposit(double amount) {
		// validation
		if (amount <= 0.0)
			return false;
		// business logic
		this.balance = this.balance + amount;
		return true;
	}

	// business method
	public boolean withdraw(double amount) {
		// validation rule
		if (amount <= 0.0)
			return false;
		// business rule
		if (amount > this.balance)
			return false;
		// business logic
		this.balance = this.balance - amount;
		return true;
	}
	
	@Override
	public String toString() {
		return "Account[iban: %-24s, balance: %-16.2f]".formatted(
				this.iban,this.balance);
	}
}