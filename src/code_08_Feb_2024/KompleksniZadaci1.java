package code_08_Feb_2024;

public class KompleksniZadaci1 {

	public static void main(String[] args) {

		int input;
		do {
			System.out.println(
					"Press 1 to: Enter the realized income for the given insurance category and day of the month.");
			System.out.println(
					"Press 2 to: Change the realized income for a given insurance category and day of the month.");
			System.out.println(
					"Press 3 to: Display of results sorted by insurance categories for the selected day of the month.");
			System.out.println(
					"Press 4 to: (NOT IMPLEMENTED YET) Display of results sorted by days of the month for the selected category.");
			System.out.println(
					"Press 5 to: (NOT IMPLEMENTED YET) Calculate and display the day when the lowest income was achieved and how much it amounts to.");
			System.out.println(
					"Press 6 to: (NOT IMPLEMENTED YET) Calculate and display the total monthly income for each category of insurance.");
			System.out.println("Press 7 to: (NOT IMPLEMENTED YET) Calculate and display the average monthly income.");
			input = TextIO.getlnInt();
			if (input < 0 || 7 < input) {
				System.out.println("You entered incorrect value! Try again: ");
			}
		} while (input < 0 || 7 < input);

		int[][] dataBase = new int[30][5];
		
		dataBase[1][0] = 4;
		dataBase[1][1] = 25;
		dataBase[1][2] = -9;
		dataBase[1][3] = 84;
		dataBase[1][4] = 3;

		switch (input) {
		case 1:
			firstOption(dataBase);
			break;
		case 2:
			secondOption(dataBase);
			break;
		case 3:
			thirdOption(dataBase);
			break;
		case 4:
			System.out.println("(NOT IMPLEMENTED YET)");
			break;
		case 5:
			fifthOption(dataBase);
			break;
		case 6:
			System.out.println("(NOT IMPLEMENTED YET)");
			break;
		case 7:
			System.out.println("(NOT IMPLEMENTED YET)");
			break;
		}
	}

	private static void fifthOption(int[][] dataBase) {
		int minValueDay = -1;
		int minValueCategory = -1;
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0 ; i < 30 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (dataBase[i][j] < min) {
					min = dataBase[i][j];
					minValueDay = i;
					minValueCategory = j;
				}
			}
		}
		System.out.printf("The lowest income was achieved on day %d for category %d and it amounts to %f. %n", minValueDay, minValueCategory, min);
		
	}

	private static void thirdOption(int[][] dataBase) {
		int day;
		do {
			System.out.println("Select the day for which you want to sort: ");
			day = TextIO.getlnInt();
			if (day < 0 || 30 < day) {
				System.out.println("You entered incorrect value! Try again: ");
			}
		} while (day < 0 || 30 < day);
		
		int[] array = new int[5];
		array = dataBase[day];
		
		int[] categories = new int[5];
        for (int i = 0; i < 5; i++) {
        	categories[i] = i + 1;
        }
		
		sortArray(array, categories);
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.printf("On %d. day for category %d the income is: %d %n", day, categories[i], array[i]);
		}
	}

	private static void sortArray(int[] array, int[] categories) {
		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i + 1] < array[i]) {
					swap(array, i);
					swap(categories, i);
				}
			}
		}
	}

	private static void swap(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

	private static void secondOption(int[][] dataBase) {
		System.out.println("Enter the realized income for the given insurance category and day of the month.");

		int category;
		do {
			System.out.print("Enter the category: ");
			category = TextIO.getlnInt();
		} while (category < 0 || 5 < category);

		int day;
		do {
			System.out.print("Enter the day: ");
			day = TextIO.getlnInt();
		} while (day < 0 || 30 < day);

		System.out.print("Enter the new value of the income: ");
		dataBase[day][category] = TextIO.getlnInt();

	}

	private static void firstOption(int[][] dataBase) {
		System.out.println("Enter the realized income for the given insurance category and day of the month.");

		int category;
		do {
			System.out.print("Enter the category: ");
			category = TextIO.getlnInt();
			if (category < 0 || 5 < category) {
				System.out.println("You entered incorrect value! Try again: ");
			}
		} while (category < 0 || 5 < category);

		int day;
		do {
			System.out.print("Enter the day: ");
			day = TextIO.getlnInt();
			if (day < 0 || 30 < day) {
				System.out.println("You entered incorrect value! Try again: ");
			}
		} while (day < 0 || 30 < day);

		System.out.print("Enter the income: ");
		dataBase[day][category] = TextIO.getlnInt();
	}
}