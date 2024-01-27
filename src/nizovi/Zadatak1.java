package nizovi;

public class Zadatak1 {

	public static void main(String[] args) {

		System.out.println("Enter how many elements you want in the array: ");
		int N;
		while (true) {
			N = TextIO.getlnInt();

			if (N < 0 || 50 <= N) {
				System.out.println("Incorrect input. Make sure that the length of array is (0 < N <= 50).");
				continue;
			}
			break;
		}

		double sum = 0;
		double max = Double.NEGATIVE_INFINITY;
		//int maxIndex = 0;

		double[] array = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Enter %d. number of the array: ", i + 1);
			array[i] = TextIO.getlnDouble();
			sum += array[i];

			if (array[i] > max) {
				max = array[i];
				//maxIndex = i;
			}
		}

		System.out.println("");
		System.out.printf("Sum of all elements in the array is: %f%n", sum);
		System.out.printf("Maximum number is %f.", max);

		System.out.println("");
		for (int i = 0; i < N; i++) {
			if (array[i] == max) {
				System.out.printf("On position %d there is a maximum element.%n", i);
			}
		}
	}
}