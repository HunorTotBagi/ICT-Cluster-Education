package com.iktpreobuka.serialization.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.iktpreobuka.serialization.security.Views;

@JsonIgnoreProperties({ "password", "version" })
public class UserEntity {

	@JsonView(Views.Public.class)
	@JsonProperty("ID")
	private Integer id;

	@JsonView(Views.Public.class)
	private String name;

	@JsonView(Views.Admin.class)
	private Date dateOfBirth;

	@JsonView(Views.Admin.class)
	private String email;

	private String password;
	private Integer version;

	@JsonView(Views.Private.class)
	@JsonManagedReference
	private AddressEntity address;

	public UserEntity() {
		super();
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
