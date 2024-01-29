package nizovi;

public class Zadatak3_nizovi {

	public static void main(String[] args) {

		final int upperBound = 12;
		int maxNumberOfElements = -1;

		while (maxNumberOfElements < 0 || upperBound < maxNumberOfElements) {
			System.out.printf("Enter the length of the array. The number should be 0 < n <= %d. %n", upperBound);
			maxNumberOfElements = TextIO.getlnInt();
		}

		int counterA = 0;
		int counterB = 0;
		int[] array = new int[maxNumberOfElements];
		int[] oddArray = new int[maxNumberOfElements];
		int[] evenArray = new int[maxNumberOfElements];

		for (int i = 0; i < maxNumberOfElements; i++) {
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

		for (int i = 0; i < maxNumberOfElements; i++) {
			if (evenArray[i] != 0)
				System.out.printf("The %d. element of even array is: %d %n", i + 1, evenArray[i]);
		}

		for (int i = 0; i < maxNumberOfElements; i++) {
			if (oddArray[i] != 0)
				System.out.printf("The %d. element of odd array is: %d %n", i + 1, oddArray[i]);
		}
	}
}