package code_01_Feb_2024;

import nizovi.TextIO;

public class ZadatakNiz6 {

	public static void main(String[] args) {
		
		final int upperBound = 15;
		int maxNumberOfElements = -1;

		while (maxNumberOfElements < 0 || upperBound < maxNumberOfElements) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			maxNumberOfElements = TextIO.getlnInt();
		}

		int counter = 0;
		char[] array = new char[maxNumberOfElements];
		char[] lowerCaseArray = new char[maxNumberOfElements];

		for (int i = 0; i < maxNumberOfElements; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnChar();
			if (Character.isLowerCase(array[i])) {
				lowerCaseArray[counter] = array[i];
				counter++;
			}
		}

		for (int i = 0; i < counter; i++) {
			System.out.printf("The %d. element of even array is: %c %n", i + 1, lowerCaseArray[i]);
		}
	}
}