package if_selekcija;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		
		System.out.println("Enter the first number: ");
		firstNumber = TextIO.getlnInt();
		
		System.out.println("Enter the seond number: ");
		secondNumber = TextIO.getlnInt();
		
		if (firstNumber < secondNumber) {
			System.out.printf("%d is bigger than %d", secondNumber, firstNumber);
		}
		else {
			System.out.printf("%d is smaller than %d", firstNumber, secondNumber);
		}
	}
}