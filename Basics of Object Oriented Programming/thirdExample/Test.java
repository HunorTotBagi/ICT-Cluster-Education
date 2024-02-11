package thirdExample;

public class Test {

	public static void main(String[] args) {
		Employee firstEmloyee = new Employee();
		Employee secondEmployee = new Employee();
		Employee thirdEmployee = new Employee();

		firstEmloyee.setFirstName("Hunor");
		firstEmloyee.setLastName("Tot-Bagi");
		secondEmployee.setFirstName("Nikola");
		secondEmployee.setLastName("Nikolic");
		thirdEmployee.setFirstName("Marko");
		thirdEmployee.setLastName("Markovic");

		firstEmloyee.setWorkingPlaceCoef(55);
		secondEmployee.setWorkingPlaceCoef(77);
		thirdEmployee.setWorkingPlaceCoef(34);

		firstEmloyee.calculateSalary();
		secondEmployee.calculateSalary();
		thirdEmployee.calculateSalary();

		firstEmloyee.displaySalary();
		secondEmployee.displaySalary();
		thirdEmployee.displaySalary();
	}
}