package business;

public class Pizzeria extends Shop{
	private String companyName;
	private String[] foodOffer = { "Pizza", "Pasta", "Salad", "Cola", "Beer" };

	public Pizzeria(String shopName, int maxNumberOfClients) {
		super(shopName, maxNumberOfClients);
	}

	public String[] takeInventory() {
		return foodOffer;
	}

	public void buyFromInventory(String article) {
		boolean found = false;
		for (int i = 0; i < foodOffer.length; i++) {
			if (foodOffer[i] == article) {
				System.out.printf("\nYou ordered article %s.", article);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.printf("\nWe don't have %s, sorry!", article);
		}
	}

	public void listProducts() {
		System.out.println("\nWe have these products available: ");
		for (int i = 0; i < foodOffer.length; i++) {
			System.out.printf("\n%d. %s", i + 1, foodOffer[i]);
		}
	}

	public String getName() {
		return this.companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}

}
