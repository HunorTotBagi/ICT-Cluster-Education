package business;

public class Restaurant extends Shop{
	private String companyName;
	private String[] menu = { "Soup", "Salmon", "Mushrooms" };

	public Restaurant(String shopName, int maxNumberOfClients) {
		super(shopName, maxNumberOfClients);

	}

	public String[] takeInventory() {
		return menu;
	}

	public void buyFromInventory(String article) {
		boolean found = false;
		for (int i = 0; i < menu.length; i++) {
			if (menu[i] == article) {
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
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("\n%d. %s", i + 1, menu[i]);
		}
	}

	public String getName() {
		return this.companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}
}
