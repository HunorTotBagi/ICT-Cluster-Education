package com.iktpreobuka.slajd2_zadaci.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
