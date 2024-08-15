package inheritance2;

public class Test {

	public static void main(String[] args) {
		Student firstStudent = new Student("Marko", "Markovic", 21, 654, 9, 10);
		Student secondStudent = new Student("Nikola", "Nikolic", 22, 128, 6, 8);

		firstStudent.printPersonData();
		secondStudent.printPersonData();
		
		firstStudent.calculateAverage();
		firstStudent.displayAverage();
		
		secondStudent.calculateAverage();
		secondStudent.displayAverage();
	}
}