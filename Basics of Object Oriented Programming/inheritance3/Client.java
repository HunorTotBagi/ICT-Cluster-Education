package inheritance3;

public class Client extends Person {
	private double accountBalance;

	public Client(String firstName, String lastName, int age, int accountBalance) {
		super(firstName, lastName, accountBalance);
		this.setAccountBalance(accountBalance);
	}

	public void displayMoney() {
		System.out.printf("%s %s have %.2f Dollars on account. %n", this.getFirstName(), this.getLastName(),
				this.getAccountBalance());
	}

	public void sendMoney(double money, Client receiver) {
		if (this.getAccountBalance() < money) {
			sendingMoneyMessage(money, receiver);
			System.out.printf("\nYou don't have this much money on your account.%n %n");
		} else {
			this.setAccountBalance(this.getAccountBalance() - money);
			receiver.setAccountBalance(receiver.getAccountBalance() + money);
			sendingMoneyMessage(money, receiver);
			System.out.printf("\n%.2f Dollars has been sent to %s %s.%n %n", money, receiver.getFirstName(),
					receiver.getLastName());
		}
	}

	private void sendingMoneyMessage(double money, Client receiver) {
		System.out.printf("\nSending %.2f Dollars to %s %s...", money, receiver.getFirstName(), receiver.getLastName());
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}