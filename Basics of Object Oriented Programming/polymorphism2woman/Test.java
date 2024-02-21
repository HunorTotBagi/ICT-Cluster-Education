package polymorphism2woman;

public class Test {

	public static void main(String[] args) {
		Person personOne = new Person("Hunor", "Tot-Bagi", 31);
		Woman womanOne = new Woman("Ivana", "Ivanovic", 21, "Jovanovic");

		personOne.printPersonData();
		womanOne.printPersonData();
	}
}