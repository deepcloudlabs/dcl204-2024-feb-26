package com.example.banking.application;

import java.util.concurrent.ThreadLocalRandom;

import com.example.banking.domain.Account;
import com.example.banking.domain.CheckingAccount;
import com.example.banking.domain.exception.InsufficientBalanceException;

public class StudyPolymorphism {

	public static void main(String[] args) {
		Account account;
		if (ThreadLocalRandom.current().nextBoolean())
			account = new Account("TR1", 10_000);
		else
			account = new CheckingAccount("TR1", 20_000, 1_000);
		System.out.println(account.getClass().getName());
		try {
			account.withdraw(25_000);
		} catch (InsufficientBalanceException e) {
			account.deposit(e.getDeficit());
		} catch (IllegalArgumentException e) {
			System.err.println(String.format("Failed: %s", e.getMessage()));
		}
		System.out.println(account);
	}

}
