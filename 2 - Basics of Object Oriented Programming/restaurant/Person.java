package restaurant;

public abstract class Person {
	protected String id;
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String email;
	
	public Person(String id, String firstName, String lastName, String phoneNumber, String email) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
