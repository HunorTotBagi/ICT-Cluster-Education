package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.Role;
import com.iktpreobuka.slajd2_zadaci.entities.UserEntity;

@RestController
public class UserController {
    public List<UserEntity> getDB() {
        List<UserEntity> users = new ArrayList<>();

        UserEntity u1 = new UserEntity(1, "Vladimir", "Dimitrieski", "dimitrieski@uns.ac.rs", "vladimir", "vladimir", Role.ROLE_CUSTOMER);
        UserEntity u2 = new UserEntity(2, "Milan", "Celikovic", "milancel@uns.ac.rs", "milan", "milan", Role.ROLE_CUSTOMER);
        UserEntity u3 = new UserEntity(3, "Nebojsa", "Horvat", "horva.n@uns.ac.rs", "nebojsa", "nebojsa", Role.ROLE_CUSTOMER);
        users.add(u1);
        users.add(u2);
        users.add(u3);

        return users;
    }

	@RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<UserEntity> getUsers() {
        return getDB();
    }
}
