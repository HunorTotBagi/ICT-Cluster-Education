package com.iktpreobuka.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.project.entities.AddressEntity;
import com.iktpreobuka.project.repositories.AddressRepository;
import com.iktpreobuka.project.services.AddressDao;

@RestController
@RequestMapping(value = "/api/v1/addresses")
public class AddressController {

	@Autowired
	protected AddressRepository addressRepository;
	
	@Autowired
	protected AddressDao addressService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{username}")
	public List<AddressEntity> findAddressesByUsername(String username){
		return addressService.findAddressesByUsername(username);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<AddressEntity> getAddresses() {
		return addressService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public AddressEntity createAddress(@RequestParam String city, @RequestParam String country, @RequestParam String street) {
		return addressService.createAddress(city, country, street);
	}
}
