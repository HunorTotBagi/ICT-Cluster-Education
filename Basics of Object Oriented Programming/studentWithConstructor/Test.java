package studentWithConstructor;

public class Test {

	public static void main(String[] args) {
		
		Student firstStudent = new Student("Hunor", "Tot-Bagi", 9, 10);
		Student secondStudent = new Student("Nikola", "Nikolic", 8, 9);
		
		firstStudent.calculateScore();
		firstStudent.displayScore();
		
		secondStudent.calculateScore();
		secondStudent.displayScore();
		
	}
}	