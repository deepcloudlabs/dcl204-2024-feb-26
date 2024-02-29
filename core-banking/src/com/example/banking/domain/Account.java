package com.example.banking.domain;

import com.example.banking.domain.exception.InsufficientBalanceException;

// OOP: i) Class/Object -> Encapsulation + Information Hiding Principle
//         Modeling/Abstraction
//         Domain Class
public class Account  {
	// members: attributes, methods
	// attributes: iban, balance
	// instance variable -> iban
	private final String iban; // hidden?
	// instance variable -> balance
	protected double balance; // hidden?
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
	public double deposit(double amount) { 
		// validation rule
		if (amount <= 0.0)
			throw new IllegalArgumentException("Amount must be positive");
		// business logic
		this.balance = this.balance + amount;
		return this.balance;
	}

	// business method
	public double withdraw(double amount) throws InsufficientBalanceException {
		System.out.println("Account::withdraw");		
		// validation rule
		if (amount <= 0.0)
			throw new IllegalArgumentException("Amount must be positive");
		// business rule
		if (amount > this.balance) {
			double deficit = amount - this.balance;
			throw new InsufficientBalanceException("Your balance does not cover your expenses.",deficit);
		}
		// business logic
		this.balance = this.balance - amount;
		return this.balance;
	}
	


	@Override
	public String toString() {
		return "Account[iban: %-24s, balance: %-16.2f]".formatted(
				this.iban,this.balance);
	}
}