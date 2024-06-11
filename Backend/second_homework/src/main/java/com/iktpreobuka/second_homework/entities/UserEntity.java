package com.iktpreobuka.second_homework.entities;

import com.fasterxml.jackson.annotation.JsonView;
import com.iktpreobuka.second_homework.security.Views;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonView(Views.Employee.class)
	private String name;

	@JsonView(Views.Manager.class)
	private String email;

	@JsonView(Views.Director.class)
	private EmploymentLevel employmentLevel;

	public UserEntity() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmploymentLevel getEmploymentLevel() {
		return employmentLevel;
	}

	public void setEmploymentLevel(EmploymentLevel employmentLevel) {
		this.employmentLevel = employmentLevel;
	}
}
