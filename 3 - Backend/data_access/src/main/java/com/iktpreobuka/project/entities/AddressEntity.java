package com.iktpreobuka.project.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
	@Version
	protected Integer version;
	@Column(nullable = false)
	protected String city;
	@Column(nullable = false)
	protected String street;
	@Column(nullable = false)
	protected String country;

	@OneToMany(mappedBy = "address", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JsonIgnore
	protected List<UserEntity> users = new ArrayList<>();

	public AddressEntity() {
	}

	public List<UserEntity> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
