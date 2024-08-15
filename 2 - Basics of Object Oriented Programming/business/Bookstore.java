package business;

public class Bookstore extends Shop{
	private String companyName;
	private String[] bookStorage = { "Hamlet", "Dracula", "Harry Potter and the Philosopher's Stone",
			"Na Drini Ćuprija" };

	public Bookstore(String shopName, int maxNumberOfClients) {
		super(shopName, maxNumberOfClients);
	}

	public String[] takeInventory() {
		return bookStorage;
	}

	public void buyFromInventory(String article) {
		boolean found = false;
		for (int i = 0; i < bookStorage.length; i++) {
			if (bookStorage[i] == article) {
				System.out.printf("\nYou ordered the book %s.", article);
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
		for (int i = 0; i < bookStorage.length; i++) {
			System.out.printf("\n%d. %s", i + 1, bookStorage[i]);
		}
	}

	public String getName() {
		return this.companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}
}
