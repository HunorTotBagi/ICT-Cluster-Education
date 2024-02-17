package inheritance2;

public class Test {

	public static void main(String[] args) {
		
		Employee firstEmployee = new Employee("Hunor", "Tot-Bagi", 31, 45);
		Employee secondEmployee = new Employee("Nikola", "Nikolic", 25, 35);
		
		Student firstStudent = new Student("Marko", "Markovic", 21, 654, 9, 10);
		
		firstEmployee.printPersonData();
		secondEmployee.printPersonData();
		
		firstEmployee.getSalary(10);
		secondEmployee.getSalary(15);
		
		firstEmployee.displaySalary();
		secondEmployee.displaySalary();

		firstStudent.printPersonData();
		firstStudent.calculateAverageScore();
		firstStudent.printScore();
	}
}