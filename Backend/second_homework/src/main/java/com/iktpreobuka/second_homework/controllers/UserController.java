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

import com.fasterxml.jackson.annotation.JsonView;
import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.dto.UserDTO;
import com.iktpreobuka.second_homework.security.Views;
import com.iktpreobuka.second_homework.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public UserEntity createUser(@RequestBody UserDTO userDTO) {
		return userService.createUser(userDTO);
	}

	@GetMapping("/employee")
	@JsonView(Views.Employee.class)
	public Iterable<UserEntity> getAllUsersForEmployee() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/manager")
	@JsonView(Views.Manager.class)
	public Iterable<UserEntity> getAllUsersForManager() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/director")
	@JsonView(Views.Director.class)
	public Iterable<UserEntity> getAllUsersForDirector() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}/employee")
	@JsonView(Views.Employee.class)
	public UserEntity getUserByIdForEmployee(@PathVariable String id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/{id}/manager")
	@JsonView(Views.Manager.class)
	public UserEntity getUserByIdForManager(@PathVariable String id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/{id}/director")
	@JsonView(Views.Director.class)
	public UserEntity getUserByIdForDirector(@PathVariable String id) {
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
