package com.example.banking.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("An account")
class AccountTest {

	@DisplayName("successfully created")
	@Test
	void createAccountSuccessfully() {
		Account account = new Account("tr1", 10_000);
		assertEquals("tr1", account.getIban());
		assertEquals(10_000, account.getBalance());
	}

}
