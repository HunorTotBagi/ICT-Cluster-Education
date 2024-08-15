package abstraction2;

public abstract class Employee extends Person {
	private double workingPlaceCoef;
	private double salary;

	public Employee() {}

	public Employee(String firstName, String lastName, int age, double workingPlaceCoef) {
		super(firstName, lastName, age);
		this.setWorkingPlaceCoef(workingPlaceCoef);
	}

	public abstract void calculateSalary();
	
	public void displaySalary() {
		System.out.printf("%s %s have salary of %.2f Dollars. %n", this.firstName, this.lastName, this.salary);
	}

	public void printPersonData() {
		System.out.printf("First name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Age: %s %n %n", this.getAge());
		System.out.printf("Working place coefficient: %f %n %n", this.getWorkingPlaceCoef());
	}

	public double getWorkingPlaceCoef() {
		return this.workingPlaceCoef;
	}

	public void setWorkingPlaceCoef(double workingPlaceCoef) {
		this.workingPlaceCoef = workingPlaceCoef;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}