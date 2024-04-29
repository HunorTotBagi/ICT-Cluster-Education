package com.iktpreobuka.slajd2_zadaci.controllers;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.BankClientEntity;

@RestController
public class BankClientRestController extends HelperMethods {

	protected List<BankClientEntity> getDataBase() {

		List<BankClientEntity> clients = new ArrayList<BankClientEntity>();

		clients.add(new BankClientEntity(1, "Sophia", "Smith", "sophiasmith@gmail.com", LocalDate.of(1930, 5, 15),
				"NoviSad"));
		clients.add(new BankClientEntity(2, "John", "Doe", "johndoe@jahoo.com", LocalDate.of(1985, 8, 25), "NewYork"));
		clients.add(new BankClientEntity(3, "Emma", "Johnson", "emmajohnson@citrommail.com", LocalDate.of(1977, 11, 10),
				"NoviSad"));
		clients.add(new BankClientEntity(4, "Janos", "Kolbasz", "janos.kolbasz@gmail.com", LocalDate.of(1995, 3, 3),
				"Belgrade"));

		return clients;
	}

	// Exercise 1
	
	@RequestMapping(method = RequestMethod.GET, value = "/emails")
	public List<String> emails() {
		List<BankClientEntity> clients = getDataBase();

		return getAllClientEmails(clients);
	}

	@RequestMapping(method = RequestMethod.GET, value = "clients/{firstLetter}")
	public List<String> getFirstNamesGivenLetter(@PathVariable String firstLetter) {
		List<BankClientEntity> clients = getDataBase();

		return getNamesBasedOnFirstLetter(firstLetter, clients);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clients/firstLetters")
	public List<String> firstLetters(@RequestParam("firstLetter") String firstLetter, @RequestParam("secondLetter") String secondLetter) {
		List<BankClientEntity> clients = getDataBase();

		return getFirstAndLastNameBasedOnParams(firstLetter, secondLetter, clients);
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

	// Exercises 2
	
	@RequestMapping(method = RequestMethod.PUT, value = "/clients/bonitet")
	public String decisionForCredit() {
		List<BankClientEntity> clients = getDataBase();

		for (int i = 0; i < clients.size(); i++) {
			if (getClientAge(clients, i) >= 65) {
				clients.get(i).setCreditworthiness("N");
			} else {
				clients.get(i).setCreditworthiness("P");
			}
		}
		return "Successfully added creditworthiness to all clients";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/clients/delete")
	public String deleteClient() {
		List<BankClientEntity> clients = getDataBase();

		for (int i = 0; i < clients.size(); i++) {
			BankClientEntity client = clients.get(i);

			if (client.getName().isEmpty() || client.getSurname().isEmpty() || client.getEmail().isEmpty()) {
				clients.remove(i);
			}
		}
		return "Clients with missing first name, last name or email removed.";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clients/countLess/{years}")
	public List<BankClientEntity> youngerThan(@PathVariable String years) {
		List<BankClientEntity> clients = getDataBase();
		List<BankClientEntity> result = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			if (getClientAge(clients, i) < Integer.parseInt(years))
				result.add(clients.get(i));
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clients/averageYears")
	public int getAverageYears() {
		List<BankClientEntity> clients = getDataBase();
		int counter = 0;

		for (int i = 0; i < clients.size(); i++) {
			counter += getClientAge(clients, i);
		}
		return counter / clients.size();
	}

	// Exercises 3
	
	@RequestMapping(method = RequestMethod.PUT, value = "/clients/changelocation/{clientId}")
	public String changeCity(@PathVariable String clientId, @RequestParam("city") String city) {
		List<BankClientEntity> clients = getDataBase();
		
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getId().equals(clientId)) {
				clients.get(i).setCity(city);
			}
		}
		return "Changed city for client";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/clients/from/{city}")
	public List<BankClientEntity> getClientsByCity(@PathVariable String city) {
		List<BankClientEntity> clients = getDataBase();
		List<BankClientEntity> result = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getCity().toLowerCase().equals(city)) {
				result.add(clients.get(i));
			}
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/clients/findByCityAndAge")
	public List<BankClientEntity> getClientsByCityAndAge(@RequestParam("city") String city,
			@RequestParam("age") String age) {
		List<BankClientEntity> clients = getDataBase();
		List<BankClientEntity> result = new ArrayList<>();
		
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getCity().toLowerCase().equals(city)
					&& getClientAge(clients, i) < Integer.parseInt(age)) {
				result.add(clients.get(i));
			}
		}
		return result;
	}
}
