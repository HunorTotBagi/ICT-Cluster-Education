package com.iktpreobuka.myfirstproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	@RequestMapping("/")
	public String hello() {
		return "Moja prva aplikacija";
	}
}