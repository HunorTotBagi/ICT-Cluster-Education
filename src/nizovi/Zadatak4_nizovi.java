package nizovi;

public class Zadatak4_nizovi {

	public static void main(String[] args) {

		final int upperBound = 10;
		int input = -1;

		while (input < 0 || upperBound < input) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			input = TextIO.getlnInt();
		}

		int counterEven = 0;
		int counterOdd = 0;

		int[] array = new int[input];
		int[] evenIndexedArray = new int[input];
		int[] oddIndexedArray = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnInt();
			if (i % 2 == 0) {
				evenIndexedArray[counterEven] = array[i];
				counterEven++;
			} else {
				oddIndexedArray[counterOdd] = array[i];
				counterOdd++;
			}
		}

		for (int i = 0; i < input; i++) {
			if (evenIndexedArray[i] != 0)
				System.out.printf("The %d. element of even indexed array is: %d %n", i + 1, evenIndexedArray[i]);
		}

		for (int i = 0; i < input; i++) {
			if (oddIndexedArray[i] != 0)
				System.out.printf("The %d. element of odd indexed array is: %d %n", i + 1, oddIndexedArray[i]);
		}
	}
}