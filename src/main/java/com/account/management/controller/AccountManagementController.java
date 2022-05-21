package com.account.management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.account.management.models.Account;
import com.account.management.models.BusinessAccount;
import com.account.management.models.PersonalAccount;

@RestController
public class AccountManagementController {

	@GetMapping("/getAccountDetails/{category}/{accountNumber}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable String category, @PathVariable String accountNumber) {

		if (category.equalsIgnoreCase("Personal")) {
			
			PersonalAccount personalAccount = new PersonalAccount();
			personalAccount.setPersonalName("Personal Name");
			return new ResponseEntity<Account>(personalAccount, HttpStatus.OK);
		
		} else if (category.equalsIgnoreCase("Business")) {
			
			BusinessAccount businessAccount = new BusinessAccount();
			return new ResponseEntity<Account>(businessAccount, HttpStatus.OK);
			
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
