package com.example.banking.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
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

}
