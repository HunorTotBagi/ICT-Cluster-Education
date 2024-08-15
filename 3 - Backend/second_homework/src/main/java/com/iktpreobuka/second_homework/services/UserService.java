package com.iktpreobuka.second_homework.services;

import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.dto.UserDTO;

public interface UserService {
	public UserEntity createUser(UserDTO userDTOBody);

	public Iterable<UserEntity> getAllUsers();

	public UserEntity getUserById(String id);

	public UserEntity updateUser(String id, UserDTO userDTOBody);

	public UserEntity deleteUser(String id);
}
