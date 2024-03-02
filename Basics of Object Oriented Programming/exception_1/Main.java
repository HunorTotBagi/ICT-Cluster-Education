package exception_1;

public class Main {

	public static void main(String[] args) {
		double result;

		try {
			result = koren(1, 4, 2);
			System.out.printf("Result is: %f", result);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public static double root(double A, double B, double C) throws IllegalArgumentException {

		double disc;
		if (A == 0) {
			throw new IllegalArgumentException("A can't be zero.");
		} else {
			disc = B * B - 4 * A * C;
			if (disc < 0)
				throw new IllegalArgumentException("Discriminant is less than zero.");
		}

		return (-B + Math.sqrt(disc)) / (2 * A);
	}

	static public double koren(double A, double B, double C) {
		assert A != 0 : "Vodeci koeficijent kvadratne jednacine ne sme biti nula!";
		double disk = B * B - 4 * A * C;
		assert disk >= 0 : "Diskriminanta kvadratne jednacine ne sme biti negativna!";
		return (-B + Math.sqrt(disk)) / (2 * A);
	}
}