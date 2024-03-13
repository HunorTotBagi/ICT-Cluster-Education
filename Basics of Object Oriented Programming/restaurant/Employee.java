package restaurant;

public class Employee extends Person{
	private String position;
	private double salary;

	public Employee(String id, String firstName, String lastName, String phoneNumber, String email, String position, double salary) {
		super(id, firstName, lastName, phoneNumber, email);
		this.setPosition(position);
		this.setSalary(salary);
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
