package com.iktpreobuka.slajd2_zadaci.entities;

public class UserEntity {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String username;
	protected String password;
	protected String email;
	protected Role role;
	
	public UserEntity() {}

	public UserEntity(int id, String firstName, String lastName, String username, String password, String email, Role role) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setUsername(username);
		setPassword(password);
		setEmail(email);
		setRole(role);
	}

	public int getId() {
		return this.id;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
