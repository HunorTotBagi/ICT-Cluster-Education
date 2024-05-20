package com.iktpreobuka.project.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.project.entities.AddressEntity;
import com.iktpreobuka.project.entities.UserEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {
	List<AddressEntity> findByCity(String city);
	
	List<AddressEntity> findByCountryOrderByCountry(String country);
}
