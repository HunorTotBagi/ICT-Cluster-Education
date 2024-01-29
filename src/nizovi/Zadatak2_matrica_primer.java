package nizovi;

public class Zadatak2_matrica_primer {

	public static void main(String[] args) {

		int upperBoundRows = 10;
		int upperBoundCols = 20;

		System.out.println("Enter how many rows will your matrix have: ");
		int rows;
		while (true) {
			rows = TextIO.getlnInt();

			if (rows < 0 || upperBoundRows < rows) {
				System.out.printf("Incorrect input. Make sure that the number of rows is (0 < rows < %d).",
						upperBoundRows);
				continue;
			}
			break;
		}

		System.out.println("Enter how many columns will your matrix have: ");
		int cols;
		while (true) {
			cols = TextIO.getlnInt();

			if (cols < 0 || upperBoundCols < cols) {
				System.out.printf("Incorrect input. Make sure that the number of columns is (0 < columns < %d).",
						upperBoundCols);
				continue;
			}
			break;
		}

		int[][] matrix = new int[rows][cols];
		int summOfElements = 0;
		int input;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("Enter element [%d,%d]: %n", i, j);
				input = TextIO.getlnInt();
				matrix[i][j] = input;
				summOfElements += input;
			}
		}

		System.out.printf("Summ of all elements in the matrix is: %d %n", summOfElements);

		int[] sumOfRows = new int[rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sumOfRows[i] += matrix[i][j];
			}
			System.out.printf("Sum of %d. row in the matrix is: %d %n", i + 1, sumOfRows[i]);
		}
	}
}