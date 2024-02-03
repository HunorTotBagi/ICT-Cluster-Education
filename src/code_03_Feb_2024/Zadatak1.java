package code_03_Feb_2024;

public class Zadatak1 {

	public static void main(String[] args) {

		int[] array = new int[] { 4, 2, 5, 1, 3 };

		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;

		int positionOfMin = 0;
		int positionOfMax = 0;

		int upperLimit = 4;
		int lowerLimit = 3;
		int counter = 0;
		int[] complexSearch = new int[5];

		int positionOfInput = -1;

		System.out.println("Enter number that you would like to search in array: ");
		int input = TextIO.getlnInt();

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] == input) {
				positionOfInput = i;
			}

			if (array[i] < min) {
				min = array[i];
				positionOfMin = i;
			}

			if (max < array[i]) {
				max = array[i];
				positionOfMax = i;
			}

			if (array[i] < lowerLimit || upperLimit < array[i]) {
				complexSearch[counter] = array[i];
				counter++;
			}
		}

		System.out.printf("Sum of the array is: %d %n", sum);

		double average = sum / array.length;
		System.out.printf("Average value of array: %f %n", average);
		System.out.printf("The minimal value of the array: %f %n", min);
		System.out.printf("The maximal value of the array: %f %n", max);
		System.out.printf("The position of minimal value of the array: %d %n", positionOfMin);
		System.out.printf("The position of maximal value of the array: %d %n", positionOfMax);

		if (positionOfInput != -1) {
			System.out.printf("Position of %d is %d.", input, positionOfInput);
		} else {
			System.out.printf("Entered number %d is not in the array. %n", input);
		}

		System.out.println(" ");
		System.out.println("Elements of complex search array is: ");
		for (int i = 0; i < counter; i++) {
			System.out.print(complexSearch[i] + " ");
		}

		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i + 1] < array[i]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		System.out.println(" ");
		System.out.println("Sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}