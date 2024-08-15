package final_test_example;

public class Programmer extends Person implements Iterator{
	private String experience;
	private double salary;
	
	public Programmer() {}
	
	public Programmer(String firstName, String lastName, int age, String experience, double salary) {
		super(firstName, lastName, age);
		this.experience = experience;
		this.salary = salary;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
