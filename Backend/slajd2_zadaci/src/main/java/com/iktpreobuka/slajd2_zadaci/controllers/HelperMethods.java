package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.List;

import com.iktpreobuka.slajd2_zadaci.entities.BankClientEntity;

public class HelperMethods {

	protected List<String> getAllEmails(List<BankClientEntity> clients) {
		List<String> emails = new ArrayList<>();
		for (int i = 0; i < clients.size(); i++) {
			emails.add(clients.get(i).getEmail());
		}
		return emails;
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
	
	protected void getAllClientNames(List<BankClientEntity> clients, List<String> names) {
		for (int i = 0; i < clients.size(); i++) {
			names.add(clients.get(i).getName());
		}
	}
}
