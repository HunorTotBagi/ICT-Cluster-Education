package com.iktpreobuka.second_homework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.second_homework.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
