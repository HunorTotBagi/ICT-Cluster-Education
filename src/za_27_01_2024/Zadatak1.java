package za_27_01_2024;

public class Zadatak1 {

	public static void main(String[] args) {

		int summ = 0;
		int counter = 0;
		int lowerBound = 1;
		int upperBound = 160;
		int exitCondition = 0;

		while (true) {
			System.out.println("Enter number of students: ");
			int input = TextIO.getInt();

			if (input == exitCondition) {
				break;
			}

			if (input < lowerBound || upperBound < input) {
				System.out.printf("Invalid input. Number of studens has to be in range %d to %d.%n", lowerBound,
						upperBound);
				continue;
			}

			summ += input;
			counter++;
		}
		if (summ == 0) {
			System.out.println("You entered zero students.");
		} else {
			double result = summ / counter;
			System.out.printf("Average number of studens in a year is: %f", result);
		}
	}
}