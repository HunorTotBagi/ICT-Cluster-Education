package inheritance1;

public class Test {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Hunor", "Tot-Bagi", 31, 215);
		Employee secondEmployee = new Employee("Nikola", "Nikolic", 25, 300);
		
		firstEmployee.printPersonData();
		secondEmployee.printPersonData();
		
		firstEmployee.calculateSalary(10);
		secondEmployee.calculateSalary(15);
		
		firstEmployee.displaySalary();
		secondEmployee.displaySalary();
	}
}