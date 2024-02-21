package polymorphism2woman;

public class Woman extends Person{
	private String maidenName;
	
	public Woman(){}
	
	public Woman(String firstName, String lastName, int age, String maidenName) {
		super(firstName, lastName, age);
		this.setMaidenName(maidenName);
	}
	
	public void printPersonData() {
		System.out.printf("\nFirst name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Maiden name: %s %n", this.getMaidenName());
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
}
