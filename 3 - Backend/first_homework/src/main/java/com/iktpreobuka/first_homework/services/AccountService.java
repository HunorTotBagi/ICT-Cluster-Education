package com.iktpreobuka.first_homework.services;

import com.iktpreobuka.first_homework.entities.AccountEntity;

public interface AccountService {
	public AccountEntity createAccount(AccountEntity accountBody);

	public Iterable<AccountEntity> getAllAccounts();

	public AccountEntity getAccountById(String id);

	public AccountEntity updateAccount(String id, AccountEntity accountBody);

	public AccountEntity deleteAccount(String id);
}
