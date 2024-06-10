package com.iktpreobuka.second_homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.dto.UserDTO;
import com.iktpreobuka.second_homework.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public UserEntity createUser(@RequestBody UserDTO userDTO) {
		return userService.createUser(userDTO);
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
	public UserEntity updateUser(@PathVariable String id, @RequestBody UserDTO userDTO) {
		return userService.updateUser(id, userDTO);
	}

	@DeleteMapping("/{id}")
	public UserEntity deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}
}
