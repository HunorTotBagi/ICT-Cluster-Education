package taskFromFinalExam;

public class Programmer {
	String firstName, lastName, seniority;
	int age;
	double salary;

	public Programmer(String firstName, String lastName, int age, String seniority, double salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setSeniority(seniority);
		this.setSalary(salary);
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

	public String getSeniority() {
		return this.seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}