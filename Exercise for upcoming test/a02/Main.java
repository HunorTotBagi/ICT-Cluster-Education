package a02;

public class Main {

	public static void main(String[] args) {
		Student hunor = new Student("Hunor", "Tot-Bagi", 4, 5);
		Student ivan = new Student("Ivan", "Tancik", 3, 4);

		hunor.calculateAveragePoints();
		hunor.printAveragePoints();

		ivan.calculateAveragePoints();
		ivan.printAveragePoints();
	}
}