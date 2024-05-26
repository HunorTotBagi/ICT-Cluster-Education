package com.iktpreobuka.slajd2_zadaci.services;

import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;

public interface UserService {
	public UserEntity createUser(UserEntity userBody);

	public Iterable<UserEntity> getAllUsers();

	public UserEntity getUserById(String id);

	public UserEntity updateUser(String id, UserEntity userBody);

	public UserEntity deleteUser(String id);
}
