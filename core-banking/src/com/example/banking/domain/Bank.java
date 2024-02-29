package com.example.banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class Bank { // Deadline: 10:10am
	private final int bddkId;
	private String commercialName;
	private final List<Customer> customers = new ArrayList<>();

	public Bank(int bddkId, String commercialName) {
		this.bddkId = bddkId;
		this.commercialName = commercialName;
	}

	public String getCommercialName() {
		return commercialName;
	}

	public void setCommercialName(String commercialName) {
		this.commercialName = commercialName;
	}

	public int getBddkId() {
		return bddkId;
	}

	public List<Customer> getCustomers() {
		return new ArrayList<>(this.customers);
	}

	public Customer createCustomer(String identity, String fullname) {
		Objects.requireNonNull(identity);
		Objects.requireNonNull(fullname);
		// var customer = new Customer(identity, fullname);
		Customer customer = new Customer(identity, fullname);
		this.customers.add(customer);
		return customer;
	}

	public Optional<Customer> findCustomerByIdentity(String identity) {
		for (var customer : this.customers) {
			if (customer.getIdentity().equals(identity))
				return Optional.of(customer);
		}
		return Optional.empty();
	}

	public double getTotalBalance() {
		double totalBalance = 0.0;
		for (var customer : this.customers) {
			totalBalance += customer.getTotalBalance();
		}
		return totalBalance;
	}
}
