package com.iktpreobuka.second_homework.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.dto.UserDTO;
import com.iktpreobuka.second_homework.repositories.UserRepository;
import com.iktpreobuka.second_homework.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity createUser(UserDTO userDTOBody) {
		UserEntity user = new UserEntity();
		user.setName(userDTOBody.getName());
		user.setEmail(userDTOBody.getEmail());
		user.setEmploymentLevel(userDTOBody.getEmploymentLevel());
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
	public UserEntity updateUser(String id, UserDTO userDTOBody) {
		UserEntity user = userRepository.findById(Integer.parseInt(id)).get();
		if (user != null) {
			user.setName(userDTOBody.getName());
			user.setEmail(userDTOBody.getEmail());
			user.setEmploymentLevel(userDTOBody.getEmploymentLevel());
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
