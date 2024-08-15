package thirdExample;

public class Employee {
	String firstName, lastName;
	double coefWorkingPlace, salary;

	void setFirstName(String input) {
		firstName = input;
	}

	void setLastName(String input) {
		lastName = input;
	}

	void setWorkingPlaceCoef(double input) {
		coefWorkingPlace = input;
	}

	void calculateSalary() {
		salary = 3600 * coefWorkingPlace;
	}

	void displaySalary() {
		System.out.printf("Salary for %s %s is %f %n", firstName, lastName, salary);
	}
}