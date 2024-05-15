package com.iktpreobuka.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.project.entities.UserEntity;
import com.iktpreobuka.project.repositories.UserRepository;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

	@Autowired
	protected UserRepository userRepository;

	@RequestMapping(method = RequestMethod.POST)
	public UserEntity addNewUser(@RequestParam String name, @RequestParam String email) {
		UserEntity user = new UserEntity();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		return user;
	}

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<UserEntity> getUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public UserEntity findById(@PathVariable String id) {
		return userRepository.findById(Integer.parseInt(id)).get();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/updateParams/{id}")
	public UserEntity modifyUser(@PathVariable String id, @RequestParam String name, @RequestParam String email) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			user.setEmail(email);
			user.setName(name);
			userRepository.save(user);
			return user;
		}
		return new UserEntity();
	}

	// Other way of doing this with json body
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updateBody/{id}")
	public UserEntity updateUser(@RequestBody UserEntity modifiedUser, @PathVariable String id) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			user.setEmail(modifiedUser.getEmail());
			user.setName(modifiedUser.getName());
			userRepository.save(user);
			return user;
		}
		return new UserEntity();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public UserEntity updateUser(@PathVariable String id) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			userRepository.delete(user);
			return user;
		};
		return new UserEntity();
	}
}
