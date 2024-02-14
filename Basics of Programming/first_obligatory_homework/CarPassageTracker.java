package first_obligatory_homework;

public class CarPassageTracker {

	private static final int MAX_DAYS = 30;
	private static final int MAX_RAMPS = 10;
	private static int[][] carMatrix = new int[MAX_DAYS][MAX_RAMPS];

	public static void main(String[] args) {

		int input;
		do {
			displayMenu();
			input = TextIO.getlnInt();

			switch (input) {
			case 1:
				enterCarsPassed();
				break;
			case 2:
				displayTotalCarsPassed();
				break;
			case 3:
				displayDaysExceedingThreshold();
				break;
			case 4:
				getTotalNumberOfCarsInMonth();
				break;
			default:
				if (input != 0) {
					System.out.println("Invalid option! Please try again.");
				} else {
					System.out.println("You've exited the program. See you next time!");
				}
				break;
			}
		} while (input != 0);
	}

	private static void displayMenu() {
		System.out.println("\n0) Exit the program.");
		System.out.println("1) Enter the number of cars that passed for a given day and ramp.");
		System.out.println("2) Display of the total number of cars that passed through the selected ramp.");
		System.out.println("3) Display days where the total number of cars passed exceeds a specified threshold.");
		System.out.println("4) Calculate and display the total number of cars that passed through the ramps this month.");
	}

	private static void enterCarsPassed() {
		int day = getValidInput("Enter the day: ", 1, MAX_DAYS);
		int ramp = getValidInput("Enter the ramp: ", 1, MAX_RAMPS);

		int carPasses = carMatrix[day - 1][ramp - 1];
		if (carPasses > 0) {
			overrideCarPasses(day, ramp, carPasses);
		}
		else {
			inputCarPasses(day, ramp);
		}
	}

	private static void inputCarPasses(int day, int ramp) {
		int cars = getValidInput("Enter the number of cars: ", 0, 2147483647);
		carMatrix[day - 1][ramp - 1] = cars;
		System.out.printf("Successfully entered %d passed cars on day %d at ramp %d.%n", cars, day, ramp);
	}

	private static void overrideCarPasses(int day, int ramp, int carPasses) {
		System.out.printf("On day %d and ramp %d there already passed %d cars. ", day, ramp, carPasses);
		int cars = getValidInput("Enter again the number of cars (previous data will be overriden by new entry): ", 0, 2147483647);
		carMatrix[day - 1][ramp - 1] = cars;
		System.out.printf("Successfully entered %d passed cars on day %d at ramp %d.%n", cars, day, ramp);
	}

	private static void displayTotalCarsPassed() {
		int chosenRamp = getValidInput("Enter the ramp number: ", 1, MAX_RAMPS);

		int totalCars = 0;
		for (int i = 0; i < MAX_DAYS; i++) {
			totalCars += carMatrix[i][chosenRamp - 1];
		}
		System.out.printf("Total %d cars passed on ramp %d. %n", totalCars, chosenRamp);
	}

	private static void displayDaysExceedingThreshold() {
		System.out.println("Enter the threshold number of cars: ");
		int threshold = TextIO.getlnInt();
		boolean hasPassedThreshold = false;

		for (int i = 0; i < MAX_DAYS; i++) {
			int totalCars = 0;
			for (int j = 0; j < MAX_RAMPS; j++) {
				totalCars += carMatrix[i][j];
			}
			if (totalCars > threshold) {
				System.out.printf("On day %d, %d cars passed. %n", i + 1, totalCars);
				hasPassedThreshold = true;
			}
		}
		if (hasPassedThreshold == false)
			System.out.println("There are no days where to total number of cars pass the given threshold.");
	}

	private static void getTotalNumberOfCarsInMonth() {
		int totalCars = 0;
		for (int i = 0; i < MAX_DAYS; i++) {
			for (int j = 0; j < MAX_RAMPS; j++) {
				totalCars += carMatrix[i][j];
			}
		}
		System.out.printf("Total %d cars passed this month on all ramps. %n", totalCars);
	}

	private static int getValidInput(String message, int lowerLimit, int upperLimit) {
		int input;
		do {
			System.out.println(message);
			input = TextIO.getlnInt();
			if (input < lowerLimit || upperLimit < input)
				System.out.println("Invalid input! Please try again.");
		} while (input < lowerLimit || upperLimit < input);
		return input;
	}
}