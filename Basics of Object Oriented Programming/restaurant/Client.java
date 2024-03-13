package restaurant;

public class Client extends Person{
	private String address;

	public Client(String id, String firstName, String lastName, String phoneNumber, String email, String address) {
		super(id, firstName, lastName, phoneNumber, email);
		this.setAddress(address);
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}