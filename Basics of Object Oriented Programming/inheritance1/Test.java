package inheritance1;

public class Test {

	public static void main(String[] args) {
		
		Employee firstEmployee = new Employee("Hunor", "Tot-Bagi", 31, 45);
		Employee secondEmployee = new Employee("Nikola", "Nikolic", 25, 35);
		
		firstEmployee.printPersonData();
		secondEmployee.printPersonData();
		
		firstEmployee.getSalary(10);
		secondEmployee.getSalary(15);
		
		firstEmployee.displaySalary();
		secondEmployee.displaySalary();

	}
}