package a03;

public class Main {

	public static void main(String[] args) {
		Employee hunor = new Employee("Hunor", "Tot-Bagi", 4);
		Employee ivan = new Employee("Ivan", "Tancik", 5);
		Employee marko = new Employee("Nikola", "Nikolic", 6);
		
		hunor.calculateSalary();
		ivan.calculateSalary();
		marko.calculateSalary();
		
		hunor.printSalary();
		ivan.printSalary();
		marko.printSalary();
	}
}