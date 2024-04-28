package com.iktpreobuka.restexamples.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.restexamples.entities.BankClientEntity;

@RestController
@RequestMapping("/bankclients")
public class BankClientRestController {
	protected List<BankClientEntity> getDB() {
		List<BankClientEntity> clients = new ArrayList<BankClientEntity>();
		clients.add(new BankClientEntity(1, "Milan", "Celikovic", "milancel@uns.ac.rs"));
		clients.add(new BankClientEntity(2, "Vladimir", "Dimitrieski", "dimitrieski@uns.ac.rs"));
		return clients;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<BankClientEntity> getAll() {
		return getDB();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{clientId}")
	public BankClientEntity getById(@PathVariable String clientId) {
		for (BankClientEntity bcb : getDB())
			if (bcb.getId().equals(Integer.parseInt(clientId)))
				return bcb;
		return new BankClientEntity();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestBody BankClientEntity client) {
		System.out.println(client.getName().concat("").concat(client.getSurname()));
		return "New client added";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{clientId}")
	public BankClientEntity modify(@PathVariable String clientId, @RequestBody BankClientEntity client) {
		BankClientEntity bcb = new BankClientEntity(1, "Milan", "Celikovic", "milancel@uns.ac.rs");
		if (clientId.equals("1")) {
			bcb.setName(client.getName());
			return bcb;
		} else
			return null;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{clientId}")
	public BankClientEntity delete(@PathVariable String clientId) {
		for (BankClientEntity bcb : getDB())
			if (bcb.getId().equals(Integer.parseInt(clientId))) {
				getDB().remove(bcb);
				return bcb;
			}
		return new BankClientEntity();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/client")
	public BankClientEntity getByNameSurname(@RequestParam("name") String name,
			@RequestParam("surname") String surname) {
		if (name.equals("Milan") && surname.equals("Celikovic"))
			return new BankClientEntity(1, "Milan", "Celikovic", "milancel@uns.ac.rs");
		else
			return new BankClientEntity();
	}

}
