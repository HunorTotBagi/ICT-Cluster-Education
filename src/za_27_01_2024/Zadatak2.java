package za_27_01_2024;

public class Zadatak2 {

	public static void main(String[] args) {

		int counter = 0;
		int lowerBound = 6;
		int upperBound = 142;

		while (true) {
			System.out.println("Enter a number: ");
			int input = TextIO.getInt();

			if (input == -1) {
				break;
			}

			if (input < lowerBound || upperBound < input) {
				System.out.printf("Invalid input. Number has to be in range %d to %d.%n", lowerBound, upperBound);
				continue;
			}

			if (input % 7 == 0) {
				counter++;
			}
		}
		System.out.printf("There is in total %d numbers divisible by 7.", counter);
	}
}