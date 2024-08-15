package business;

public class Main {

	public static void main(String[] args) {
		Pastry pastryShop = new Pastry("City", 40);
		Pizzeria pizzeriaOne = new Pizzeria("La'forza", 1);
		Restaurant restaurantOne = new Restaurant("Veliki", 15);
		Bookstore bookstoreOne = new Bookstore("Vulkan", 50);
		
		pizzeriaOne.getListOfClients().addClient("Hunor Tot-Bagi");
		pizzeriaOne.getListOfClients().addClient("Ivan Tančik");

		System.out.println("");
		pastryShop.listProducts();
		pastryShop.buyFromInventory("Ice cream");
		pastryShop.buyFromInventory("Orange");

		System.out.println("");
		pizzeriaOne.listProducts();
		pizzeriaOne.buyFromInventory("Pizza");
		pizzeriaOne.buyFromInventory("Burek");

		System.out.println("");
		restaurantOne.listProducts();
		restaurantOne.buyFromInventory("Mushrooms");
		restaurantOne.buyFromInventory("Cevapi");

		System.out.println("");
		bookstoreOne.listProducts();
		bookstoreOne.buyFromInventory("Harry Potter and the Chamber of Secrets");
		bookstoreOne.buyFromInventory("Na Drini Ćuprija");
	}
}