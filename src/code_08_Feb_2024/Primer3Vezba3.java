package code_08_Feb_2024;

public class Primer3Vezba3 {

	public static void main(String[] args) {

		int maxCapacity = 40;
		int input;

		do {
			System.out.printf("Enter number of students between 0 < N <= %d: ", maxCapacity);
			input = TextIO.getlnInt();
		} while (input < 1 || maxCapacity < input);

		String[] firstNameArray = new String[input];
		String[] lastNameArray = new String[input];
		int[] JMBGArray = new int[input];
		String[] cityArray = new String[input];

		for (int i = 0; i < input; i++) {
			readFirstName(firstNameArray, i);
			readLastName(lastNameArray, i);
			readJMBG(JMBGArray, i);
			readCity(cityArray, i);
		}

		System.out.println("Enter 'A' for sorting JMBG by ascending order or 'D' for descending: ");
		char sortingCriteria = TextIO.getlnChar();

		if (sortingCriteria == 'A') {
			sortByAscendingOrder(firstNameArray, lastNameArray, JMBGArray, cityArray);
		} else {
			sortByDescendingOrder(firstNameArray, lastNameArray, JMBGArray, cityArray);
		}

		printSortedStudents(firstNameArray, lastNameArray, JMBGArray, cityArray);
	}

	private static void printSortedStudents(String[] firstNameArray, String[] lastNameArray, int[] JMBGArray,
			String[] cityArray) {
		for (int i = 0; i < JMBGArray.length; i++) {
			System.out.printf("JMBG: %d | First name: %s | Last name: %s | City: %s %n", JMBGArray[i],
					firstNameArray[i], lastNameArray[i], cityArray[i]);
		}
	}

	private static void sortByDescendingOrder(String[] firstNameArray, String[] lastNameArray, int[] JMBGArray, String[] cityArray) {
		for (int j = 1; j < JMBGArray.length; j++) {
			for (int i = 0; i < JMBGArray.length - j; i++) {
				if (JMBGArray[i + 1] > JMBGArray[i]) {
					swapInt(JMBGArray, i);
					swapStr(firstNameArray, i);
					swapStr(lastNameArray, i);
					swapStr(cityArray, i);
				}
			}
		}
	}

	private static void sortByAscendingOrder(String[] firstNameArray, String[] lastNameArray, int[] JMBGArray, String[] cityArray) {
		for (int j = 1; j < JMBGArray.length; j++) {
			for (int i = 0; i < JMBGArray.length - j; i++) {
				if (JMBGArray[i + 1] < JMBGArray[i]) {
					swapInt(JMBGArray, i);
					swapStr(firstNameArray, i);
					swapStr(lastNameArray, i);
					swapStr(cityArray, i);
				}
			}
		}
	}

	private static void swapInt(int[] JMBGArray, int i) {
		int temp = JMBGArray[i];
		JMBGArray[i] = JMBGArray[i + 1];
		JMBGArray[i + 1] = temp;
	}

	private static void swapStr(String[] array, int i) {
		String tempFirstName = array[i];
		array[i] = array[i + 1];
		array[i + 1] = tempFirstName;
	}

	private static void readCity(String[] cityArray, int i) {
		System.out.printf("Enter the %d student's city: ", i + 1);
		cityArray[i] = TextIO.getlnString();
		System.out.println("-----------------------------------");
	}

	private static void readJMBG(int[] JMBGArray, int i) {
		System.out.printf("Enter %d. student's JMBG: ", i + 1);
		JMBGArray[i] = TextIO.getlnInt();
	}

	private static void readLastName(String[] lastNameArray, int i) {
		System.out.printf("Enter %d. student's last name: ", i + 1);
		lastNameArray[i] = TextIO.getlnString();
	}

	private static void readFirstName(String[] firstNameArray, int i) {
		System.out.printf("Enter %d. student's first name: ", i + 1);
		firstNameArray[i] = TextIO.getlnString();
	}
}