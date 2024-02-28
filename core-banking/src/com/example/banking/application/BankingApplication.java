package com.example.banking.application;

import com.example.banking.domain.Account;
import com.example.banking.domain.CheckingAccount;

@SuppressWarnings("unused")
public class BankingApplication {
	public static void main(String[] args) {
		// uses constructor #2
		// acc1: i) reference (type is Account) variable
		//      ii) local variable (inside a method/function)   
		Account acc1 = new Account("tr1", 0.0);
		acc1.withdraw(200_000_000);
		System.out.println(acc1);
		// Error: final -> acc1.iban = "tr4";
		// uses constructor #1
		Account acc2 = new CheckingAccount("tr2",10_000, 5_000);
		acc2.deposit(10_000_000);
		acc2.withdraw(200_000_000);
		System.out.println(acc2); 
		// numbers: i) value-typed variable
		//         ii) local variable 
		int number = 42;
	}
}
