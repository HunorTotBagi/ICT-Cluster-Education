package code_08_Feb_2024;

public class Primer2Vezba2 {

	public static void main(String[] args) {
		final int upperLimit = 30;
		int input;

		do {
			System.out.printf("Enter a number between 0 < N <= 30: ");
			input = TextIO.getlnInt();
		} while (input < 0 || upperLimit < input);

		int[] array = new int[input];
		array = ArrayFeeder(input);

		int exitCondition;
		do {
			System.out.println("----------------------------------------------------------");
			System.out.printf("Press 1 to calculate the summ of elements in the array. %n");
			System.out.printf("Press 2 to calculate the average value in the array. %n");
			System.out.printf("Press 3 to get the maximum value in the array. %n");
			System.out.printf("Press 4 to get the minimum value in the array. %n");
			System.out.printf("Press 0 to exit. %n");
			exitCondition = TextIO.getlnInt();

			switch (exitCondition) {
			case 1:
				System.out.printf("Sum of the array is: %d %n", SumOfArray(array));
				break;
			case 2:
				System.out.printf("Average value of the array is: %d %n", AverageOfArray(array));
				break;
			case 3:
				System.out.printf("Maximum value in the array is: %f %n", MaximumOfArray(array));
				break;
			case 4:
				System.out.printf("Minimum value in the array is: %f %n", MinimumOfArray(array));
			}

		} while (exitCondition != 0);

	}

	public static int[] ArrayFeeder(int input) {
		int[] array = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.printf("Enter the %d. number of the array: ", i + 1);
			array[i] = TextIO.getlnInt();
		}
		return array;
	}

	public static int SumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int AverageOfArray(int[] array) {
		return SumOfArray(array) / array.length;
	}

	private static double MaximumOfArray(int[] array) {
		double maximum = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < array.length; i++) {
			if (maximum < array[i]) {
				maximum = array[i];
			}
		}
		return maximum;
	}

	private static double MinimumOfArray(int[] array) {
		double minimum = Double.POSITIVE_INFINITY;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
			}
		}
		return minimum;
	}

}
