package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;
import com.iktpreobuka.slajd2_zadaci.enums.Role;

@RestController
@RequestMapping(value = "/project/users")
public class UserController {

	public List<UserEntity> getDB() {
		List<UserEntity> users = new ArrayList<>();

		users.add(new UserEntity(1, "Vladimir", "Dimitrieski", "vladimirCar22", "vladimir123", "dimitrieski@uns.ac.rs",
				Role.ROLE_CUSTOMER));
		users.add(new UserEntity(2, "Milan", "Celikovic", "milan_professor", "milan3321", "milancel@uns.ac.rs",
				Role.ROLE_CUSTOMER));
		users.add(new UserEntity(3, "Nebojsa", "Horvat", "007nebojsa", "nebojsa1235", "horva.n@uns.ac.rs",
				Role.ROLE_CUSTOMER));

		return users;
	}

	@RequestMapping()
	public List<UserEntity> getUsers() {
		return getDB();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public UserEntity getUserById(@PathVariable String id) {
		List<UserEntity> users = getDB();

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == Integer.parseInt(id)) {
				return users.get(i);
			}
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.POST)
	public UserEntity addNewCustomer(@RequestParam("id") String id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("email") String email) {
		List<UserEntity> users = getDB();
		UserEntity newUser = new UserEntity(Integer.parseInt(id), firstName, lastName, username, password, email,
				Role.ROLE_CUSTOMER);
		users.add(newUser);
		return newUser;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public UserEntity modifyCustomer(@PathVariable String id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("username") String username,
			@RequestParam("email") String email) {

		List<UserEntity> users = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false) {
			return null;
		}

		users.get(index).setFirstName(firstName);
		users.get(index).setLastName(lastName);
		users.get(index).setUsername(username);
		users.get(index).setEmail(email);

		return users.get(index);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}/role/{role}")
	public UserEntity modifyCustomerRole(@PathVariable String id, @PathVariable String role) {

		List<UserEntity> users = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false) {
			return null;
		}

		if (role.equals("admin"))
			users.get(index).setRole(Role.ROLE_ADMIN);
		else if (role.equals("customer"))
			users.get(index).setRole(Role.ROLE_CUSTOMER);
		else if (role.equals("seller"))
			users.get(index).setRole(Role.ROLE_SELLER);

		return users.get(index);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/changePassword/{id}")
	public UserEntity changePassword(@PathVariable String id, @RequestParam("oldPassword") String oldPassword,
			@RequestParam("newPassword") String newPassword) {

		List<UserEntity> users = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		UserEntity user = users.get(index);

		if (found == false) {
			return null;
		}

		if (user.getPassword().equals(oldPassword))
			user.setPassword(newPassword);
		else {
			return null;
		}

		return user;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public UserEntity deleteUser(@PathVariable String id) {

		List<UserEntity> users = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		UserEntity user = users.get(index);

		if (found == false) {
			return null;
		}

		users.remove(user);

		return user;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/by-username/{username}")
	public UserEntity getUserByUsername(@PathVariable String username) {

		List<UserEntity> users = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(username)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false)
			return null;

		return users.get(index);
	}

}
