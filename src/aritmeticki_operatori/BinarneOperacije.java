package aritmeticki_operatori;

public class BinarneOperacije {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 5;
		
		int sabiranje = a + b;
		int oduzimanje = a - b;
		int mnozenje = a * b;
		int deljenje = a / b;
		int ostatak = a % b;
				
		System.out.println("a + b = " + sabiranje);
		System.out.println("a - b = " + oduzimanje);
		System.out.println("a * b = " + mnozenje);
		System.out.println("a / b = " + deljenje);
		System.out.println("a % b = " + ostatak);
		
	}
}