package za_27_01_2024;

public class Zadatak4 {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 0;
		int lowerBound = 5;
		int upperBound = 10;
		int exitCondition = 0;

		while (true) {
			System.out.print("Enter a grade: ");
			int grade = TextIO.getInt();

			if (grade == exitCondition) {
				break;
			}

			if (grade < lowerBound || upperBound < grade) {
				System.out.printf("Invalid input. Grade has to be in range %d to %d.%n", lowerBound, upperBound);
				continue;
			}

			sum += grade;
			counter++;

		}

		if (counter > 0) {
			double average = (double) sum / counter;
			System.out.printf("Average grade: %f.", average);
		} else {
			System.out.println("You entered no grades");
		}

	}

}
