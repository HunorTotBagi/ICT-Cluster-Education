package restaurant;

public class Ingredients {
	private String id;
	private String name;
	private int quantity;
	private String expirationDate;

	public Ingredients(String id, String name, int quantity, String expirationDate) {
		this.setId(id);
		this.setName(name);
		this.setQuantity(quantity);
		this.setExpirationDate(expirationDate);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}
