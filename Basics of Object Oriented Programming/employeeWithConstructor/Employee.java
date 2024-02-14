package employeeWithConstructor;

public class Employee {
	private String firstName, lastName;
	private double workingPlaceCoef;
	
	public Employee(){}
	
	public Employee(String firstName, String lastName, double workingPlaceCoef){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setWorkingPlaceCoef(workingPlaceCoef);
	}

	private void setWorkingPlaceCoef(double workingPlaceCoef) {
		this.workingPlaceCoef = workingPlaceCoef;
	}
	
	private double getWorkingPlaceCoef() {
		return this.workingPlaceCoef;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String getLastName() {
		return this.lastName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	private String getFirstName() {
		return this.firstName;
	}
	
	public double calculateSalary(int workingDays) {
		return this.getWorkingPlaceCoef() * workingDays * 100;
	}
	
	public void displaySalary() {
		System.out.printf("Employee %s %s have %f salary.%n", this.getFirstName(), this.getLastName(), this.calculateSalary(0));
	}
}