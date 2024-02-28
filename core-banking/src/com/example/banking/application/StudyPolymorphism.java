package com.example.banking.application;

import java.util.concurrent.ThreadLocalRandom;

import com.example.banking.domain.Account;
import com.example.banking.domain.CheckingAccount;

public class StudyPolymorphism {

	public static void main(String[] args) {
		Account account;
		if (ThreadLocalRandom.current().nextBoolean())
			account = new Account("TR1", 10_000);
		else
			account = new CheckingAccount("TR1", 20_000, 1_000);
		System.out.println(account.getClass().getName());
		account.withdraw(500);

	}

}
