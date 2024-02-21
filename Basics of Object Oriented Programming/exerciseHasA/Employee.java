package exerciseHasA;

public class Employee extends Person {
	private double workingPlaceCoef;
	private double salary;

	public Employee() {}

	public Employee(String firstName, String lastName, int age, int workingPlaceCoef) {
		super(firstName, lastName, age);
		this.setWorkingPlaceCoef(workingPlaceCoef);
	}

	public void calculateSalary(double workingDays) {
		this.setSalary(this.getWorkingPlaceCoef() * workingDays);
	}

	public void displaySalary() {
		System.out.printf("%s %s have salary of %.2f Dollars. %n", this.firstName, this.lastName, this.salary);
	}

	public double getWorkingPlaceCoef() {
		return this.workingPlaceCoef;
	}

	public void setWorkingPlaceCoef(int workingPlaceCoef) {
		this.workingPlaceCoef = workingPlaceCoef;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}