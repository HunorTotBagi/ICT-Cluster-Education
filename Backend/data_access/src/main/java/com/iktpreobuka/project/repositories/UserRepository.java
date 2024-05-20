package com.iktpreobuka.project.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.project.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
	Optional<UserEntity> findByEmail(String email);

	List<UserEntity> findByNameOrderByEmailAsc(String name);

	List<UserEntity> findByDateOfBirthOrderByDateOfBirthAscNameAsc(LocalDate localDate);
	
	List<UserEntity> findByNameStartingWithIgnoreCase(String firstLetter);
}
