package com.iktpreobuka.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.iktpreobuka.project.entities.AddressEntity;
import com.iktpreobuka.project.entities.UserEntity;
import com.iktpreobuka.project.repositories.AddressRepository;
import com.iktpreobuka.project.services.AddressDao;

@RestController
@RequestMapping(value = "/api/v1/addresses")
public class AddressController {

	@Autowired
	protected AddressRepository addressRepository;

	@Autowired
	protected AddressDao addressService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<AddressEntity> getAddresses() {
		return addressService.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public AddressEntity createAddress(@RequestParam String city, @RequestParam String country,
			@RequestParam String street) {
		return addressService.createAddress(city, country, street);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public AddressEntity getAddressesById(@PathVariable String id) {
		return addressRepository.findById(Integer.parseInt(id)).get();
	}

	@PutMapping("/{id}")
	public AddressEntity modifyAddress(@PathVariable String id, @RequestParam String city, @RequestParam String country,
			@RequestParam String street) {
		AddressEntity address = addressRepository.findById(Integer.parseInt(id)).get();
		if (address != null) {
			address.setCity(city);
			address.setCountry(country);
			address.setStreet(street);
			addressRepository.save(address);
			return address;
		}
		return new AddressEntity();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public AddressEntity updateAddress(@PathVariable String id) {
		AddressEntity address = addressRepository.findById(Integer.parseInt(id)).get();
		if (address != null) {
			addressRepository.delete(address);
			return address;
		}
		return new AddressEntity();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/by-city")
	public List<AddressEntity> getAddressByCity(@RequestParam String city) {
		return addressRepository.findByCity(city);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/by-country")
	public List<AddressEntity> getCountryOrderByCountry(@RequestParam String country) {
		return addressRepository.findByCountryOrderByCountry(country);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{username}")
	public List<AddressEntity> findAddressesByUsername(@PathVariable String username) {
		return addressService.findAddressesByUsername(username);
	}
}
