package com.example.banking.domain;

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
	public boolean withdraw(double amount) {
		System.out.println("CheckingAccount::withdraw");
		if (amount <= 0.0)
			return false;
		if (amount > (this.balance + this.overdraftAmount))
			return false;
		this.balance = this.balance - amount;
		return true;
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
		return "CheckingAccount[iban: %-24s, balance: %-16.2f, overdraftAmount: %8.3f]".formatted(
				this.getIban(),this.balance,this.overdraftAmount);
	}
}
