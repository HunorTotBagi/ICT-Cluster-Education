package za_27_01_2024;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int lowerBound = -10;
		int upperBound = 100;
		
		System.out.print("Enter N: ");
		int N = TextIO.getInt();
		
		double minimum = Double.POSITIVE_INFINITY;

		for (int i = 1; i <= N; i++) {
			int input;

			do {
				System.out.printf("Enter number %d: ", i);
				input = TextIO.getInt();

				if (input < lowerBound || upperBound < input) {
					System.out.printf("Invalid input. Enter a number between %d and %d.%n", lowerBound, upperBound);
				}
			} while (input < lowerBound || upperBound < input);

			if (input < minimum) {
				minimum = input;
			}
		}

		System.out.printf("Minimum value is %.2f%n", minimum);
	}
}