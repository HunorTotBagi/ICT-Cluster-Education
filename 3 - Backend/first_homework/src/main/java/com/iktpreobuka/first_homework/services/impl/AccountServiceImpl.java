package com.iktpreobuka.first_homework.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.first_homework.entities.AccountEntity;
import com.iktpreobuka.first_homework.repositories.AccountRepository;
import com.iktpreobuka.first_homework.services.AccountService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class AccountServiceImpl implements AccountService {

	@PersistenceContext
	protected EntityManager em;

	@Autowired
	protected AccountRepository accountRepository;

	@Override
	public AccountEntity createAccount(AccountEntity accountBody) {
		AccountEntity account = new AccountEntity();
		account.setUsername(accountBody.getUsername());
		account.setAccountNumber(accountBody.getAccountNumber());
		account.setEmail(accountBody.getEmail());
		account.setDateOfBirth(accountBody.getDateOfBirth());
		accountRepository.save(account);
		return account;
	}

	@Override
	public Iterable<AccountEntity> getAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public AccountEntity getAccountById(String id) {
		return accountRepository.findById(Integer.parseInt(id)).get();
	}

	@Override
	public AccountEntity updateAccount(String id, AccountEntity accountBody) {
		AccountEntity account = accountRepository.findById(Integer.parseInt(id)).get();
		if (account != null) {
			account.setUsername(accountBody.getUsername());
			account.setAccountNumber(accountBody.getAccountNumber());
			account.setEmail(accountBody.getEmail());
			account.setDateOfBirth(accountBody.getDateOfBirth());
			accountRepository.save(account);
			return account;
		}
		return new AccountEntity();
	}

	@Override
	public AccountEntity deleteAccount(String id) {
		AccountEntity account = accountRepository.findById(Integer.parseInt(id)).get();
		if (account != null) {
			accountRepository.delete(account);
			return account;
		}
		return new AccountEntity();
	}
}
