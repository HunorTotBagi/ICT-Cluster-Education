package x_complexTaskBank;

public class Transaction implements WorkWithFiles{
	private Client receiver, sender;
	private float ammount;
	private Boolean internal;
	
	public Transaction() {}
	
	public Transaction(Client receiver, Client sender, float ammount, Boolean internal) {
		this.receiver = receiver;
		this.sender = sender;
		this.ammount = ammount;
		this.internal = internal;
	}
	
	@Override
	public void readFromFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeToFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	public Client getReceiver() {
		return this.receiver;
	}

	public void setReceiver(Client receiver) {
		this.receiver = receiver;
	}

	public Client getSender() {
		return this.sender;
	}

	public void setSender(Client sender) {
		this.sender = sender;
	}

	public float getAmmount() {
		return this.ammount;
	}

	public void setAmmount(float ammount) {
		this.ammount = ammount;
	}

	public Boolean getInternal() {
		return this.internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

}
