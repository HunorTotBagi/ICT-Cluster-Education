package business;

public abstract class Shop implements Naming{
	private String shopName;
	private ListOfClients listOfClients;
	
	public Shop(String shopName, int maxNumberOfClients){
		this.setShopName(shopName);
		this.setListOfClients(new ListOfClients(maxNumberOfClients));
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ListOfClients getListOfClients() {
		return this.listOfClients;
	}

	public void setListOfClients(ListOfClients listOfClients) {
		this.listOfClients = listOfClients;
	}

	public void calculatePDV() {
		System.out.printf("PDV is 20%!");
	}

	public abstract String[] takeInventory();

	public abstract void listProducts();

	public abstract void buyFromInventory(String article);
}