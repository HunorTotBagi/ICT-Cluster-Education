package com.iktpreobuka.first_homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.first_homework.entities.AccountEntity;
import com.iktpreobuka.first_homework.services.AccountService;

@RestController
@RequestMapping(path = "/api/v1/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping
	public AccountEntity createAccount(@RequestBody AccountEntity accountBody) {
		return accountService.createAccount(accountBody);
	}

	@GetMapping
	public Iterable<AccountEntity> getAllAccounts() {
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/{id}")
	public AccountEntity getAccountById(@PathVariable String id) {
		return accountService.getAccountById(id);
	}
	
	@PutMapping("/{id}")
	public AccountEntity updateAccount(@PathVariable String id, @RequestBody AccountEntity accountBody) {
		return accountService.updateAccount(id, accountBody);
	}

	@DeleteMapping("/{id}")
	public AccountEntity deleteAccount(@PathVariable String id) {
		return accountService.deleteAccount(id);
	}
}
