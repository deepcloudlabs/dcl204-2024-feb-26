package com.example.banking.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.example.banking.domain.exception.InsufficientBalanceException;

@DisplayName("An account")
class AccountTest {

	@DisplayName("successfully created")
	@ParameterizedTest
	@CsvFileSource(resources = "accounts.csv")
	void createAccountSuccessfully(String iban, double balance) {
		Account account = new Account(iban, balance);
		assertEquals(iban, account.getIban());
		assertEquals(balance, account.getBalance());
	}

	@DisplayName("successfully created")
	@Test
	void createAccountWithZerBalanceSuccessfully() {
		Account account = new Account("tr1");
		assertEquals("tr1", account.getIban());
		assertEquals(0.0, account.getBalance());
	}

	@DisplayName("deposit with negative amount should return false")
	@Test
	void depositWithNegativeAmountShouldFail() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		// 3. Verification
		assertThrows(IllegalArgumentException.class, () -> account.deposit(-1));
		assertEquals(1_000, account.getBalance());
		// 4. Tear down
	}

	@DisplayName("deposit with positive amount should be successful")
	@Test
	void depositWithPositiveAmountShouldSuccess() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		double balance = account.deposit(1);
		// 3. Verification
		assertEquals(1_001, balance);
		// 4. Tear down
	}

	@DisplayName("withdraw with negative amount should return false")
	@Test
	void withdrawWithNegativeAmountShouldFail() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		// 3. Verification
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(-1));
		assertEquals(1_000, account.getBalance());
		// 4. Tear down
	}

	@DisplayName("withdraw with amount less than balance should be successful")
	@Test
	void withdrwWithAmountLessThanBalanceShouldSuccess() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		double balance = account.withdraw(1);
		// 3. Verification
		assertEquals(999, balance);
		// 4. Tear down
	}

	@DisplayName("withdraw all balance should be successful")
	@Test
	void withdrwAllBalanceShouldSuccess() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		double balance = account.withdraw(1_000);
		// 3. Verification
		assertEquals(0, balance);
		// 4. Tear down
	}

	@DisplayName("withdraw more than balance should fail")
	@Test
	void withdrwMoreThanBalanceShouldFail() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		// 3. Verification
		assertThrows(InsufficientBalanceException.class, () -> account.withdraw(1_000.1));
		assertEquals(1_000, account.getBalance());
		// 4. Tear down
	}

	@DisplayName("toString should contain iban and balance")
	@Test
	void toStringShouldContainIbanAndBalance() throws Throwable {
		// 1. Test Fixture/Setup
		Account account = new Account("tr1", 1_000);
		// 2. Call Exercise Method: deposit
		String result = account.toString();
		// 3. Verification
		assertTrue(result.contains("iban"));
		assertTrue(result.contains("balance"));
		assertTrue(result.contains("Account"));
		// 4. Tear down
	}
}
