package potprogrami;

public class Zadatak1 {

	public static void main(String[] args) {

		int exitCondition = -1;

		while (exitCondition != 0) {

			System.out.println("Enter the first number: ");
			int firstNumber = TextIO.getlnInt();

			System.out.println("Enter the second number: ");
			int secondNumber = TextIO.getlnInt();

			int input = -1;

			while (input < 1 || 4 < input) {
				System.out.println("Enter 1 to add these two numbers.");
				System.out.println("Enter 2 to subtract these two numbers.");
				System.out.println("Enter 3 to multiply these two numbers.");
				System.out.println("Enter 4 to divide these two numbers.");
				input = TextIO.getlnInt();
			}

			switch (input) {
			case 1:
				int sum = sum(firstNumber, secondNumber);
				System.out.printf("%d + %d = %d %n", firstNumber, secondNumber, sum);
				break;
			case 2:
				int diff = difference(firstNumber, secondNumber);
				System.out.printf("%d - %d = %d %n", firstNumber, secondNumber, diff);
				break;
			case 3:
				int product = product(firstNumber, secondNumber);
				System.out.printf("%d * %d = %d %n", firstNumber, secondNumber, product);
				break;
			case 4:
				double divide = division(firstNumber, secondNumber);
				System.out.printf("%d / %d = %f %n", firstNumber, secondNumber, divide);
				break;
			}
			
			System.out.println("If you want to exit press 0, if you want to continue enter any number that's not 0.");
			exitCondition = TextIO.getlnInt();
		}

	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int difference(int a, int b) {
		return a - b;
	}

	static int product(int a, int b) {
		return a * b;
	}

	static double division(int a, int b) {
		return (double) a / b;
	}

}
