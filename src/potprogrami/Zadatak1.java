package potprogrami;

public class Zadatak1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the first number: %n");
		int firstNumber = TextIO.getlnInt();
		
		System.out.println("Enter the second number: %n");
		int secondNumber = TextIO.getlnInt();
		
		int sum = sum(firstNumber, secondNumber);
		System.out.printf("Sum of two enterd numbers is: %f %n", sum);
		
		int diff = difference(firstNumber, secondNumber);
		System.out.printf("Differenec of two enterd numbers is: %f %n", diff);
		
		int product = product(firstNumber, secondNumber);
		System.out.printf("Sum of two enterd numbers is: %f %n", product);
		
		double divide = division(firstNumber, secondNumber);
		System.out.printf("Sum of two enterd numbers is: %d %n", divide);

	}
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int difference(int a, int b) {
		return a-b;
	}
	
	static int product(int a, int b) {
		return a*b;
	}
	
	static double division(int a, int b) {
		return (double) a/b;
	}
	

}
