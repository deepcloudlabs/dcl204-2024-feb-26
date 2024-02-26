package com.example.banking.domain;

public class Account extends Object {
	// members: attributes, methods
	// attributes: iban, balance
	private final String iban; // hidden?
	private double balance; // hidden?
	// methods: constructor, getter, withdraw, deposit

	public Account(String iban) { // constructor #1
		this.iban = iban;
		this.balance = 0.0;
	}

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
	
	public String toString() {
		return "Account[iban: %s, balance: %16.2f]".formatted(
				this.iban,this.balance);
	}
}