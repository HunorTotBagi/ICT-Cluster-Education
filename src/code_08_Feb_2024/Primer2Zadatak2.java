package code_08_Feb_2024;

public class Primer2Zadatak2 {

	public static void main(String[] args) {

		final int upperLimit = 50;
		int input;

		do {
			System.out.print("Eneter a number between 0 < N <= 50: ");
			input = TextIO.getlnInt();
		} while (input < 0 || upperLimit < input);

		int[] array = new int[input];
		array = ArrayFeeder(input);

		int result;

		result = SumOfArray(array);
		System.out.printf("Sum of elements in the array is: %d", result);
	}

	public static int[] ArrayFeeder(int input) {
		int[] array = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.printf("Enter the %d. number of the array: ", i + 1);
			array[i] = TextIO.getlnInt();
		}
		return array;
	}

	private static int SumOfArray(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}
}