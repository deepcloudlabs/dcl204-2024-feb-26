package com.example.banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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
}