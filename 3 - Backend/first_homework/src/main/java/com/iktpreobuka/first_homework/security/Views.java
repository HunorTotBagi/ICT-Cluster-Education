package com.iktpreobuka.first_homework.security;

public class Views {
	public static class RandomPerson {
	}

	public static class Client extends RandomPerson {
	}

	public static class Employee extends Client {
	}

	public static class Admin extends Employee {
	}
}
