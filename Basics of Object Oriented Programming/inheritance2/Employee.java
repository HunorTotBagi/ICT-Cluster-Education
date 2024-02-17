package inheritance2;

public class Employee extends Person{
	private int workingPlaceCoef;
	private int salary;
	
	public Employee () {}
	
	public Employee(String firstName, String lastName, int age, int workingPlaceCoef) {
		super(firstName, lastName, age);
		this.setWorkingPlaceCoef(workingPlaceCoef);
	}
	
	public int getWorkingPlaceCoef() {
		return this.workingPlaceCoef;
	}

	public void setWorkingPlaceCoef(int workingPlaceCoef) {
		this.workingPlaceCoef = workingPlaceCoef;
	}

	public void getSalary(int workingDays) {
		this.salary =  this.getWorkingPlaceCoef() * workingDays;
	}
	
	public void displaySalary() {
		System.out.printf("\n%s %s have salary %d %n", this.firstName, this.lastName, this.salary );
	}
}