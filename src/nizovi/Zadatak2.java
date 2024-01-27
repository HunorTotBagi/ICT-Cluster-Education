package nizovi;

public class Zadatak2 {

	public static void main(String[] args) {
		
		System.out.println("Enter how many rows will your matrix have: ");
		int rows;
		while (true) {
			rows = TextIO.getlnInt();

			if (rows < 0 || 10 < rows) {
				System.out.println("Incorrect input. Make sure that the number of rows is (0 < row < 10).");
				continue;
			}
			break;
		}
		
		System.out.println("Enter how many cols will your matrix have: ");
		int cols;
		while (true) {
			cols = TextIO.getlnInt();

			if (cols < 0 || 20 < cols) {
				System.out.println("Incorrect input. Make sure that the number of columns is (0 < cols < 20).");
				continue;
			}
			break;
		}
		
		int[][] matrix = new int[rows][cols];
		
		for (int i = 0; i < rows;i++) {
			for (int j = 0 ; j < cols ; j++) {
				System.out.printf("Enter element [%d,%d]: %n",i,j);
				matrix[i][j] = TextIO.getlnInt();
			}
		}
		
		int summOfElements = 0;
		
		for (int i = 0; i < rows;i++) {
			for (int j = 0 ; j < cols ; j++) {
				summOfElements += matrix[i][j];
			}
		}
		
		System.out.printf("Summ of all elements is: %d", summOfElements);

	}

}
