package com.iktpreobuka.myfirstproject.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

	@RequestMapping("/")
	public String hello() {
		return "Moja prva aplikacija";
	}

	@RequestMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {
		return String.format("Hello %s!", name);
	}

	@RequestMapping("/date")
	public String getCurrentDateTimeAsString() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		return formattedDateTime;
	}

	@RequestMapping("/array")
	public int[] myArray() {
		int[] newArray = { 1, 6, 3, 2, 7, 9, 77 };
		return newArray;
	}

	@RequestMapping("/array/sort")
	public int[] sortedArray() {
		int[] newArray = { 1, 6, 3, 2, 7, 9, 77 };
		sort(newArray.length, newArray);
		return newArray;
	}

	private void sort(int n, int[] score) {
		for (int j = 1; j < n; j++) {
			for (int i = 0; i < n - j; i++) {
				if (score[i] > score[i + 1]) {
					swapElements(score, i);
				}
			}
		}
	}

	private void swapElements(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

	@RequestMapping("/minmax")
	public int[] minMax() {
		int[] newArray = { 1, 6, 3, 2, 7, 9, 77 };
		int[] result = new int[2];
		result[0] = getMax(newArray);
		result[1] = getMin(newArray);

		return result;

	}

	private int getMax(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}

	private int getMin(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}
		return result;
	}
	
	@RequestMapping("/sumaNiza")
	public int sumaNiza() {
		int[] newArray = { 1, 6, 3, 2, 7, 9, 77 };
		return arraySum(newArray);
	}
	
	private int arraySum(int[] array) {
		int result = 0;
		for ( int i = 0 ; i < array.length ; i++) {
			result += array[i];
		}
		return result;
	}

}