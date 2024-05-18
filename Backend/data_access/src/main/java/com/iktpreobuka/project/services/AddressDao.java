package com.iktpreobuka.project.services;

import java.util.List;

import com.iktpreobuka.project.entities.AddressEntity;

public interface AddressDao {

	public List<AddressEntity> findAddressesByUsername(String username);
	
	public Iterable<AddressEntity> findAll();
	
	public AddressEntity createAddress(String city, String country, String street);
}


