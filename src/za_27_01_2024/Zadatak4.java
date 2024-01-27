package za_27_01_2024;

public class Zadatak4 {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 0;

		while (true) {
			System.out.print("Enter a grade: ");
			int grade = TextIO.getInt();

			if (grade == 0) {
				break;
			}

			if (grade < 5 || 10 < grade) {
				System.out.println("Invalid input. Grade has to be in range 5 to 10.");
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
