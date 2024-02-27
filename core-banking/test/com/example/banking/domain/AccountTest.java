package com.example.banking.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@DisplayName("An account")
class AccountTest {

	@DisplayName("successfully created")
	@ParameterizedTest
	@CsvFileSource( resources = "accounts.csv")
	void createAccountSuccessfully(String iban,double balance) {
		Account account = new Account(iban, balance);
		assertEquals(iban, account.getIban());
		assertEquals(balance, account.getBalance());
	}

	@DisplayName("deposit with negative amount should return false")
	@Test
	void depositWithNegativeAmountShouldFail() {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		boolean result = account.deposit(-1);
		// 3. Verification
		assertFalse(result);
		// 4. Tear down 
	}
	
	@DisplayName("deposit with positive amount should be successful")
	@Test
	void depositWithPositiveAmountShouldSuccess() {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		boolean result = account.deposit(1);
		// 3. Verification
		assertTrue(result);
		assertEquals(1_001, account.getBalance());
		// 4. Tear down 
	}
}
