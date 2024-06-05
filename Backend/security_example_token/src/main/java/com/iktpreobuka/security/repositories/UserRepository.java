package com.iktpreobuka.security.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.security.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
	public UserEntity findByEmail(String email);
}
