package clientBank;

public class Client {
	private String firstName, lastName,email, accountNumber, clientType;
	private double accountBalance;

	public Client() {
	}

	public Client(String firstName, String lastName, String email, String accountNumber, String clientType, double accountBalance) {
		this.setAccountBalance(accountBalance);
		this.setAccountNumber(accountNumber);
		this.setBankBalance(accountBalance);
		this.setClientType(clientType);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
	}

	public void depositMoney(double input) {
		this.accountBalance += input;
		System.out.printf("(Client: %s %s) - Depositing %.2f to your account in progress... %n", this.getFirstName(), this.getLastName(), input);
		System.out.printf("(Client: %s %s) - You successfully deposited %.2f into your account. %n", this.getFirstName(), this.getLastName(), input);
		this.displayAccountBalance();
	}

	public void withdrawMoney(double input) {
		if (this.getBankBalance() < input) {
			System.out.printf("(Client: %s %s) - Withdrawing %.2f from your account in progress... %n", this.getFirstName(), this.getLastName(), input);
			System.out.printf("(Client: %s %s) - You can't withraw %.2f from your account. %n", this.getFirstName(), this.getLastName(), input);
			this.displayAccountBalance();
		} else {
			this.accountBalance -= input;
			System.out.printf("(Client: %s %s) - Withdrawing %.2f from your account in progress... %n", this.getFirstName(), this.getLastName(), input);
			System.out.printf("(Client: %s %s) - You successfully withdraw %.2f from your account. %n", this.getFirstName(), this.getLastName(), input);
			this.displayAccountBalance();
		}
	}

	public void displayAccountBalance() {
		System.out.printf("(Client: %s %s) - Your current account balance is %.2f %n %n", this.getFirstName(), this.getLastName(), this.getAccountBalance());
	}

	public void sendMoney(double ammount, Client reciever) {
		this.withdrawMoney(ammount);
		reciever.depositMoney(ammount);
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

	public double getBankBalance() {
		return this.accountBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.accountBalance = bankBalance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public double getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}