package x_complexTaskBank;

public class Client implements WorkWithFiles {
	private String firstName, lastName, jmbg;
	private Account account;

	public Client() {
	}

	public Client(String firstName, String lastName, String jmbg, float balance, String currency, String accountNumber,
			Boolean active) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJmbg(jmbg);
		this.account = new Account(balance, currency, accountNumber, active);
	}

	public void printClientData() {
		System.out.printf("\nFirst name: %s%n", this.getFirstName());
		System.out.printf("Last name: %s%n", this.getLastName());
		System.out.printf("Jmbg: %s%n", this.getJmbg());
		System.out.printf("Money Ammount: %s%n", this.getAccount().getBalance());
	}

	@Override
	public void readFromFile(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeToFile(String fileName) {
		// TODO Auto-generated method stub

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

	public Account getAccount() {
		return this.account;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

}