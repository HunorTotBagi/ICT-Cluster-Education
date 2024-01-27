package za_27_01_2024;

public class KvadratnaJednacina {

	public static void main(String[] args) {
		
		int a, b, c;
		double x1, x2, y1;

		System.out.println("Enter a: ");
		a = TextIO.getInt();

		System.out.println("Enter b: ");
		b = TextIO.getInt();

		System.out.println("Enter c: ");
		c = TextIO.getInt();

		if (a == 0) {
			x1 = -c / b;
			System.out.printf("The equation is linear. There is only one solution %f", x1);
		} else {
			double discriminant = (b * b) - (4 * a * c);

			if (discriminant == 0) {
				x1 = -b / (2 * a);

				// a = 3 ; b = 6 ; c = 3
				System.out.printf("Discriminant is equal to zero. The equation has two identical real roots%n");
				System.out.printf("x1 = %f%n", x1);
				System.out.printf("x2 = %f%n", x1);
				
			} else if (discriminant < 0) {
				x1 = -b / 2 * a;
				y1 = Math.sqrt((4 * a * c) - (b * b)) / (2 * a);

				// a = 2 ; b = 4; c = 5
				System.out.printf("Discriminant is less than zero. The equation has two imaginary solutions.%n");
				System.out.printf("x1 = %f + %fi%n", x1, y1);
				System.out.printf("x2 = %f - %fi%n", x1, y1);
				
			} else { // d > 0
				x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

				// a = 1 ; b = 5 ; c = 1
				System.out.printf("Discriminant is geater than zero. The equation have two different real solutions.%n");
				System.out.printf("x1 = %f%n", x1);
				System.out.printf("x2 = %f%n", x2);
			}
		}
	}
}