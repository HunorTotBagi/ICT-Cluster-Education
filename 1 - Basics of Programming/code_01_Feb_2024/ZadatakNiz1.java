package code_01_Feb_2024;

import nizovi.TextIO;

public class ZadatakNiz1 {

	public static void main(String[] args) {

		final int upperBound = 12;
		int maxNumberOfElements = -1;

		while (maxNumberOfElements < 0 || upperBound < maxNumberOfElements) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			maxNumberOfElements = TextIO.getlnInt();
		}

		int counterEven = 0;
		int counterOdd = 0;
		int[] array = new int[maxNumberOfElements];
		int[] oddArray = new int[maxNumberOfElements];
		int[] evenArray = new int[maxNumberOfElements];

		for (int i = 0; i < maxNumberOfElements; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnInt();

			if (array[i] % 2 == 0) {
				evenArray[counterEven] = array[i];
				counterEven++;
			} else {
				oddArray[counterOdd] = array[i];
				counterOdd++;
			}
		}

		for (int i = 0; i < counterEven; i++) {
				System.out.printf("The %d. element of even array is: %d %n", i + 1, evenArray[i]);
		}

		for (int i = 0; i < counterOdd; i++) {
				System.out.printf("The %d. element of odd array is: %d %n", i + 1, oddArray[i]);
		}
	}
}