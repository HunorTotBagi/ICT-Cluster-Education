package com.iktpreobuka.slajd2_zadaci.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;
import com.iktpreobuka.slajd2_zadaci.services.UserService;

@RestController
@RequestMapping(value = "/project/users")
public class UserController {

	@Autowired
	protected UserService userService;

	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity userBody) {
		return userService.createUser(userBody);
	}

	@GetMapping
	public Iterable<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public UserEntity getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}

	@PutMapping("/{id}")
	public UserEntity updateUser(@PathVariable String id, @RequestBody UserEntity userBody) {
		return userService.updateUser(id, userBody);
	}

	@DeleteMapping("/{id}")
	public UserEntity deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}
}
