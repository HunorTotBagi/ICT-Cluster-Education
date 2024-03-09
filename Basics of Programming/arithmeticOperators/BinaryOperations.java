package arithmeticOperators;

public class BinaryOperations {

	public static void main(String[] args) {
		int a = 20;
		int b = 5;

		int sum = a + b;
		int subtraction = a - b;
		int multiplication = a * b;
		double division = (double) a / b;
		int remainder = a % b;

		System.out.printf("a + b = %d %n", sum);
		System.out.printf("a - b = %d %n", subtraction);
		System.out.printf("a * b = %d %n", multiplication);
		System.out.printf("a / b = %.2f %n", division);
		System.out.printf("a %% b = %d %n", remainder);
	}
}