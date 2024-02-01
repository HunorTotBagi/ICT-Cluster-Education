package code_01_Feb_2024;

import nizovi.TextIO;

public class ZadatakNiz3 {

	public static void main(String[] args) {
		
		final int upperBound = 20;
		int input = -1;

		while (input < 0 || upperBound < input) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			input = TextIO.getlnInt();
		}

		int[] array = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnInt();
		}

		int number;
		System.out.printf("Enter one whole number: ");
		number = TextIO.getlnInt();

		System.out.printf("Elements in the array are: %n");
		int counter = 0;
		for (int i = 0; i < input; i++) {
			if (array[i] == number) {
				counter++;
			}
			System.out.print(array[i] + " ");
		}

		System.out.printf("%n");

		System.out.printf("Number %d occurs %d times in the given array.", number, counter);
	}
}