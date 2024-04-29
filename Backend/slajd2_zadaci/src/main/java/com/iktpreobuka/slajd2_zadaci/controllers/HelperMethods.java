package com.iktpreobuka.slajd2_zadaci.controllers;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.iktpreobuka.slajd2_zadaci.entities.BankClientEntity;

public class HelperMethods {

	protected List<String> getAllClientEmails(List<BankClientEntity> clients) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			result.add(clients.get(i).getEmail());
		}
		return result;
	}

	protected List<String> getNamesBasedOnFirstLetter(String firstLetter, List<BankClientEntity> clients) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < clients.size(); i++) {
			String name = clients.get(i).getName();
			if (name.toLowerCase().startsWith(firstLetter)) {
				names.add(name);
			}
		}
		return names;
	}
	
	protected List<String> getFirstAndLastNameBasedOnParams(String firstLetter, String secondLetter,
			List<BankClientEntity> clients) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			String name = clients.get(i).getName();
			String surname = clients.get(i).getSurname();

			if (name.toLowerCase().startsWith(firstLetter) && surname.toLowerCase().startsWith(secondLetter)) {
				result.add(name.concat(" ").concat(surname));
			}
		}
		return result;
	}

	protected void getAllClientNames(List<BankClientEntity> clients, List<String> names) {
		for (int i = 0; i < clients.size(); i++) {
			names.add(clients.get(i).getName());
		}
	}

	protected int getClientAge(List<BankClientEntity> clients, int i) {
		LocalDate birthDate = clients.get(i).getBirthDate();
		LocalDate currentDate = LocalDate.now();

		Period age = Period.between(birthDate, currentDate);
		return age.getYears();
	}
}
