package com.example.banking.domain.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {

	private final double deficit;

	public InsufficientBalanceException(String reason, double deficit) {
		super(reason);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}

}
