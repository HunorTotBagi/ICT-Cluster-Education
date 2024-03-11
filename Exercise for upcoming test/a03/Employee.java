package a03;

public class Employee {
	private String firstName, lastName;
	private double workPlaceCoef, salary;

	public Employee(String firstName, String lastName, double workPlaceCoef) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setWorkPlaceCoef(workPlaceCoef);
	}

	public void calculateSalary() {
		this.setSalary(3600 * this.getWorkPlaceCoef());
	}

	public void printSalary() {
		System.out.printf("Salary for employee %s %s is %.2f. %n", this.getFirstName(), this.getLastName(), this.getSalary());
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getWorkPlaceCoef() {
		return this.workPlaceCoef;
	}

	public void setWorkPlaceCoef(double workPlaceCoef) {
		this.workPlaceCoef = workPlaceCoef;
	}

	public double getSalary() {
		return salary;
	}

	private void setSalary(double salary) {
		this.salary = salary;
	}
}