package operators;

public class Task1 {

	public static void main(String[] args) {
		double radius = 5;
		double height = 10;
		final double PI = 3.14;
		
		double coneVolume = radius * radius * height * PI / 3;
		
		System.out.printf("The volume of a cone with radius %.2f and height %.2f is %.2f", radius, height, coneVolume);
	}
}