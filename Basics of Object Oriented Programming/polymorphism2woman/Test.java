package polymorphism2woman;

public class Test {

	public static void main(String[] args) {
		Woman firstWoman = new Woman("Ivana", "Ivanovic", 21, "Jovanovic");
		Person firstPerson = new Person("Hunor", "Tot-Bagi", 31);
		
		firstWoman.printPersonData();
		firstPerson.printPersonData();
	}
}
