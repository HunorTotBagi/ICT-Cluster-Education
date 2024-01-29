package nizovi;

public class Zadatak3_nizovi {

	public static void main(String[] args) {

		final int numberOfElements = 12;

		int counterA = 0;
		int counterB = 0;
		int[] array = new int[numberOfElements];
		int[] oddArray = new int[numberOfElements];
		int[] evenArray = new int[numberOfElements];

		for (int i = 0; i < numberOfElements; i++) {
			System.out.printf("Enter the %d. element of the array: %n", i + 1);
			array[i] = TextIO.getlnInt();

			if (array[i] % 2 == 0) {
				evenArray[counterA] = array[i];
				counterA++;
			} else {
				oddArray[counterB] = array[i];
				counterB++;
			}
		}

		for (int i = 0; i < numberOfElements; i++) {
			if (evenArray[i] != 0)
				System.out.printf("The %d. element of even array is: %d %n", i + 1, evenArray[i]);
		}

		for (int i = 0; i < numberOfElements; i++) {
			if (oddArray[i] != 0)
				System.out.printf("The %d. element of odd array is: %d %n", i + 1, oddArray[i]);
		}
	}
}