package code_01_Feb_2024;

import nizovi.TextIO;

public class ZadatakNiz5 {

	public static void main(String[] args) {

		final int upperBound = 40;
		int maxNumberOfElements = -1;

		while (maxNumberOfElements < 0 || upperBound < maxNumberOfElements) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			maxNumberOfElements = TextIO.getlnInt();
		}

		int[] array = new int[maxNumberOfElements];
		int[] positiveArray = new int[maxNumberOfElements];

		for (int i = 0; i < maxNumberOfElements; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnInt();

			if (array[i] < 0) {
				positiveArray[i] = Math.abs(array[i]);
			}
			else {
				positiveArray[i] = array[i];
			}
		}

		for (int i = 0; i < maxNumberOfElements; i++) {
				System.out.printf("The %d. element of even array is: %d %n", i + 1, positiveArray[i]);
		}



	}

}
