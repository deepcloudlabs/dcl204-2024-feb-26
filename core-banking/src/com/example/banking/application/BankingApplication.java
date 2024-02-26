package com.example.banking.application;

import com.example.banking.domain.Account;

public class BankingApplication {
	public static void main(String[] args) {
		// uses constructor #2
		Account acc1 = new Account("tr1", 0.0);
		acc1.withdraw(200_000_000);
		System.out.println(acc1.toString());
		// Error: final -> acc1.iban = "tr4";
		// uses constructor #1
		Account acc2 = new Account("tr2");
		acc2.deposit(10_000_000);
		acc2.withdraw(200_000_000);
		System.out.println(acc2.toString());
	}
}
