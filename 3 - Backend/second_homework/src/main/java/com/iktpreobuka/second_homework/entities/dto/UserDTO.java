package com.iktpreobuka.second_homework.entities.dto;

import com.iktpreobuka.second_homework.entities.EmploymentLevel;

public class UserDTO {
	private Integer id;
	private String name;
	private String email;
	private EmploymentLevel employmentLevel;

	public UserDTO() {
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
