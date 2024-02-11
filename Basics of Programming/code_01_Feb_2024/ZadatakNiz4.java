package code_01_Feb_2024;

import nizovi.TextIO;

public class ZadatakNiz4 {

	public static void main(String[] args) {

		final int upperBound = 15;
		int input = -1;

		while (input < 0 || upperBound < input) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			input = TextIO.getlnInt();
		}

		int counter = 0;
		char[] array = new char[input];
		int[] numberArray = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.printf("Enter the %d. character of the array: %n", i + 1);
			array[i] = TextIO.getlnChar();

			if (Character.isDigit(array[i])) {
				numberArray[counter] = Character.getNumericValue(array[i]);
				counter++;
			}
		}
		

		System.out.println("---------------------------------");
		for (int i = 0; i < counter; i++) {
			System.out.printf("The %d. element of number array is: %d %n", i + 1, numberArray[i]);
		}
	}
}