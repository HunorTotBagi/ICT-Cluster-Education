package com.iktpreobuka.security.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.security.entities.RoleEntity;
import com.iktpreobuka.security.entities.UserEntity;

@RestController
public class UserController {

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public ResponseEntity<?> getUsers(){
		return new ResponseEntity<List<UserEntity>>(getDummyDB(), HttpStatus.OK);
	}
	
	protected List<UserEntity> getDummyDB() {
		List<UserEntity> list = new ArrayList<>();

		RoleEntity re = new RoleEntity();
		re.setId(1);
		re.setName("admin");

		UserEntity ue = new UserEntity();
		ue.setId(1);
		ue.setEmail("user@example.com");
		ue.setName("Vladimir");
		ue.setLastName("Dimitrieski");
		ue.setPassword("password1234");
		ue.setRole(re);

		UserEntity ue1 = new UserEntity();
		ue1.setId(2);
		ue1.setEmail("user2@example.com");
		ue1.setName("Milan");
		ue1.setLastName("Celikovic");
		ue1.setPassword("password4321");
		ue1.setRole(re);

		list.add(ue);
		list.add(ue1);

		return list;
	}
	
	

}
