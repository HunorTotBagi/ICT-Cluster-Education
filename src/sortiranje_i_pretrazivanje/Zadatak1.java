package sortiranje_i_pretrazivanje;

public class Zadatak1 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		int min = array[0];
		int max = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.printf("Sum of the array is: %d %n", sum);
		
		double average = sum / array.length;
		System.out.printf("Average value of array: %f %n", average);
	}
}
