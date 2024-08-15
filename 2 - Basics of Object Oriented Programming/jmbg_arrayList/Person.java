package jmbg_arrayList;

public class Person {
	private String firstName, lastName, jmbg;

	public Person() {
	}

	public Person(String firstName, String lastName, String jmbg) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJmbg(jmbg);
	}

	public void printData() {
		System.out.printf("First name: %s | Last Name: %s | Jmbg: %s", this.getFirstName(), this.getLastName(),
				this.getJmbg());
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

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
}