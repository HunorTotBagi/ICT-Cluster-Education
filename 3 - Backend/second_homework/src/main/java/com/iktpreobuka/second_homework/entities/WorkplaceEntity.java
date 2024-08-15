package com.iktpreobuka.second_homework.entities;

import com.fasterxml.jackson.annotation.JsonView;
import com.iktpreobuka.second_homework.security.Views;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class WorkplaceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Employee.class)
	private Integer id;
	
	@JsonView(Views.Employee.class)
	private String name;

	@OneToOne
	@JsonView(Views.Director.class)
	private UserEntity user;

	public WorkplaceEntity() {
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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
}