package x_complexTaskBank;

public class Account {
	private float balance;
	private String currency, accountNumber;
	private Boolean active;

	public Account(float balance, String currency, String accountNumber, Boolean active) {
		this.setBalance(balance);
		this.setCurrency(currency);
		this.setAccountNumber(accountNumber);
		this.setActive(active);
	}

	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}