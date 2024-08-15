package com.iktpreobuka.slajd2_zadaci.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;
import com.iktpreobuka.slajd2_zadaci.enums.Role;
import com.iktpreobuka.slajd2_zadaci.repositories.UserRepository;
import com.iktpreobuka.slajd2_zadaci.services.UserService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class UserServiceImpl implements UserService {

	@PersistenceContext
	protected EntityManager em;

	@Autowired
	protected UserRepository userRepository;

	@Override
	public UserEntity createUser(UserEntity userBody) {
		UserEntity user = new UserEntity();
		user.setFirstName(userBody.getFirstName());
		user.setLastName(userBody.getLastName());
		user.setUsername(userBody.getUsername());
		user.setPassword(userBody.getPassword());
		user.setEmail(userBody.getEmail());
		user.setRole(Role.ROLE_CUSTOMER);
		userRepository.save(user);
		return user;
	}

	@Override
	public Iterable<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity getUserById(String id) {
		return userRepository.findById(Integer.parseInt(id)).get();
	}

	@Override
	public UserEntity updateUser(String id, UserEntity userBody) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			user.setFirstName(userBody.getFirstName());
			user.setLastName(userBody.getLastName());
			user.setUsername(userBody.getUsername());
			user.setEmail(userBody.getEmail());
			userRepository.save(user);
			return user;
		}
		return new UserEntity();
	}

	@Override
	public UserEntity deleteUser(String id) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			userRepository.delete(user);
			return user;
		}
		return new UserEntity();
	}
}
