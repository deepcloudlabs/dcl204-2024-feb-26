package com.example.banking.domain;

import java.util.ArrayList;
import java.util.List;

public final class Customer {
	private final String identity;
	private String fullName;
	private final List<Account> accounts = new ArrayList<>();

	public Customer(final String identity, final String fullName) {
		this.identity = identity;
		this.fullName = fullName;
	}

	public String getIdentity() {
		return this.identity;
	}

	public String getFullName() {
		return this.fullName;
	}

	// violates information hiding principle!
	public List<Account> getAccounts() {
		return new ArrayList<>(accounts);
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	public int getNumberOfAccounts() {
		return this.accounts.size();
	}
	
	public Account findAccountByIban(String iban) {
		for (Account account : this.accounts) {
			if (account.getIban().equals(iban))
				return account;
		}
		return null;
	}
	
	// imperative programming
	public double getTotalBalance() {
		double total = 0.0;
		for (Account account : this.accounts) {
			total += account.getBalance();
		}
		return total;
	}
	// declarative programming: functional programming
	public double getTotalBalanceDeclarativeVersion() {
		return this.accounts
				   .stream()
				   .parallel()
				   .mapToDouble(Account::getBalance) // higher-order function
				   .sum();
	}
	
	
}