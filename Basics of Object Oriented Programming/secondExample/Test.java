package secondExample;

public class Test {

	public static void main(String[] args) {
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		
		firstStudent.setFirstName("Hunor");
		firstStudent.setLastname("Tot-Bagi");
		
		secondStudent.setFirstName("Nikola");
		secondStudent.setLastname("Nikolic");
		
		firstStudent.setFirstTestPoints(9);
		firstStudent.setPointsTest2(10);
		
		secondStudent.setFirstTestPoints(7);
		secondStudent.setPointsTest2(8);
		
		firstStudent.calcuateAverage();
		secondStudent.calcuateAverage();
		
		firstStudent.printAverage();
		secondStudent.printAverage();
	}
}