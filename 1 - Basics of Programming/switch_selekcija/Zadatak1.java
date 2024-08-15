package switch_selekcija;

public class Zadatak1 {

	public static void main(String[] args) {

		double a = 3;
		double b = 45;
		double c = 5;

		double x1;
		double x2;

		double d = b * b - 4 * a * c;

		if (a == 0) {
			x1 = -c / b;
		}

		
		if (d >= 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);
		} else {
			System.out.println("The equation has imaginary solutions.");
		}

	}
}
