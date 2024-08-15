package com.iktpreobuka.first_homework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.first_homework.entities.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
	public AccountEntity findByUsername(String username);
}
