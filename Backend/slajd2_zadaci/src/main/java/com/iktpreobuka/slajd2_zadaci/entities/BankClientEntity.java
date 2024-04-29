package com.iktpreobuka.slajd2_zadaci.entities;

import java.time.LocalDate;

public class BankClientEntity {
	protected Integer id;
	protected String name;
	protected String surname;
	protected String email;
	protected LocalDate birthDate;
	protected String creditworthiness;

	public BankClientEntity(Integer id, String name, String surname, String email, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.birthDate = birthDate;
	}

	public BankClientEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCreditworthiness() {
		return creditworthiness;
	}

	public void setCreditworthiness(String creditworthiness) {
		this.creditworthiness = creditworthiness;
	}
}
