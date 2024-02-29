package com.example.banking.domain;

import com.example.banking.domain.exception.InsufficientBalanceException;

// Account			: base class   /super class
// CheckingAccount	: derived class/sub class
public class CheckingAccount extends Account {
	private double overdraftAmount;

	public CheckingAccount(String iban, double balance, double overdraftAmount) {
		super(iban, balance);
		this.overdraftAmount = overdraftAmount;
	}

	public double getOverdraftAmount() {
		return this.overdraftAmount;
	}

	@Override
	public double withdraw(double amount) throws InsufficientBalanceException {
		System.out.println("CheckingAccount::withdraw");
		if (amount <= 0.0)
			throw new IllegalArgumentException("Amount must be positive");
		if (amount > (this.balance + this.overdraftAmount)) {
			double deficit = amount - this.balance - this.overdraftAmount;
			throw new InsufficientBalanceException("Your balance does not cover your expenses.", deficit);
		}
		this.balance = this.balance - amount;
		return this.balance;
	}

	void fun(double x) {
		this.balance += x;
		return;
	}

	void gun() {
		this.balance--;
	}

	@Override
	public String toString() {
		return "CheckingAccount[iban: %-24s, balance: %-16.2f, overdraftAmount: %8.3f]".formatted(this.getIban(),
				this.balance, this.overdraftAmount);
	}
}
