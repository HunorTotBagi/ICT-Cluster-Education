package inheritance1;

public class Person {
	protected String firstName, lastName;
	protected int age;

	public Person() {}

	public Person(String firstName, String lastName, int age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}

	public void printPersonData() {
		System.out.printf("First name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Age: %s %n %n", this.getAge());
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

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}