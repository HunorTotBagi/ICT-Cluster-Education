package employeeWithConstructor;

public class Test {

	public static void main(String[] args) {
		
		Employee firstEmployee = new Employee("Hunor", "Tot-Bagi", 3);
		Employee secondEmployee = new Employee("Nikola", "Nikolic", 5);
		Employee thirdEmployee = new Employee("Marko", "Markovic", 8);
		
		firstEmployee.calculateSalary(5);
		secondEmployee.calculateSalary(7);
		thirdEmployee.calculateSalary(20);
		
		firstEmployee.displaySalary();
		secondEmployee.displaySalary();
		thirdEmployee.displaySalary();
		
	}
}