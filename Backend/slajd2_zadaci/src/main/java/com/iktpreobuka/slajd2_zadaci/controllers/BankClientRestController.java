package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.BankClientEntity;

@RestController
public class BankClientRestController extends HelperMethods {

	protected List<BankClientEntity> getDataBase() {

		List<BankClientEntity> clients = new ArrayList<BankClientEntity>();

		clients.add(new BankClientEntity(1, "Sophia", "Smith", "sophiasmith@gmail.com"));
		clients.add(new BankClientEntity(2, "John", "Doe", "johndoe@jahoo.com"));
		clients.add(new BankClientEntity(3, "Emma", "Johnson", "emmajohnson@citrommail.com"));
		clients.add(new BankClientEntity(4, "Janos", "Kolbasz", "janos.kolbasz@gmail.com"));

		return clients;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/emails")
	public List<String> getEmails() {
		List<BankClientEntity> clients = getDataBase();
		return getAllEmails(clients);
	}

	@RequestMapping(method = RequestMethod.GET, value = "clients/{firstLetter}")
	public List<String> getFirstNamesGivenLetter(@PathVariable String firstLetter) {
		List<BankClientEntity> clients = getDataBase();
		return getNamesBasedOnFirstLetter(firstLetter, clients);
	}

	@RequestMapping(method = RequestMethod.GET, value = "clients/{first}/{second}")
	public List<String> getFirstNameAndLastName(@PathVariable String first, @PathVariable String second) {
		List<BankClientEntity> clients = getDataBase();

		List<String> names = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			String name = clients.get(i).getName();
			String surname = clients.get(i).getSurname();

			if (name.toLowerCase().startsWith(first) && surname.toLowerCase().startsWith(second)) {
				names.add(name.concat(" ").concat(surname));
			}
		}

		return names;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clients/sort/{order}")
	public List<String> getSortedClientNames(@PathVariable String order) {
		List<BankClientEntity> clients = getDataBase();

		List<String> names = new ArrayList<>();

		if (order.equals("asc")) {
			getAllClientNames(clients, names);
			Collections.sort(names);
			return names;

		} else if (order.equals("desc")) {
			getAllClientNames(clients, names);
			Collections.sort(names, Collections.reverseOrder());
			return names;
		}

		return names;
	}
}
