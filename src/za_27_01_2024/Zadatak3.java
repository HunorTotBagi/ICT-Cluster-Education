package za_27_01_2024;

public class Zadatak3 {

	public static void main(String[] args) {

		System.out.print("Enter N: ");
		int N = TextIO.getInt();
		
		double minimum = Double.POSITIVE_INFINITY;

		for (int i = 1; i <= N; i++) {
			int input;

			do {
				System.out.printf("Enter number %d: ", i);
				input = TextIO.getInt();

				if (input < -10 || 100 < input) {
					System.out.println("Invalid input. Enter a number between -10 and 100.");
				}
			} while (input < -10 || 100 < input);

			if (input < minimum) {
				minimum = input;
			}
		}

		System.out.printf("Minimum value is %.2f%n", minimum);
	}
}