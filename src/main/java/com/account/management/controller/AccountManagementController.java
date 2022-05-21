package com.account.management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.account.management.models.Account;
import com.account.management.models.BusinessAccount;
import com.account.management.models.PersonalAccount;

public class AccountManagementController {

	@GetMapping("/getAccountDetails/{category}/{accountNumber}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable String category, @PathVariable String accountNumber) {

		Account account = null;
		if (category.equalsIgnoreCase("Personal")) {

			account = new PersonalAccount();
		} else {
			account = new BusinessAccount();
		}

		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

}
