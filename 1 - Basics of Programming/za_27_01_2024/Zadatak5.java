package za_27_01_2024;

public class Zadatak5 {

	public static void main(String[] args) {

		int lowerBound = 15;
		int upperBound = 62;

		System.out.println("Enter N: ");
		int N = TextIO.getInt();

		int input;
		int counter = 0;
		for (int i = 1; i <= N; i++) {

			do {
				System.out.printf("Enter number %d between %d and %d: ", i, lowerBound, upperBound);
				input = TextIO.getInt();

				if (input < lowerBound || input > upperBound) {
					System.out.println("Invalid input.%n");
				}

			} while (input < lowerBound || input > upperBound);

			if (input % 3 == 0) {
				counter++;
			}
		}

		double result = (double) counter / N * 100;
		System.out.printf("Percentage of numbers divisible by three of %d entered numbers is: %.2f%%", N, result);

	}

}
