package inheritance3;

public class Test {

	public static void main(String[] args) {
		
		Client firstClient = new Client("Hunor", "Tot-Bagi", 31, 1100);
		Client secondClient = new Client("Nikola", "Nikolic", 25, 2000);
		
		firstClient.displayMoney();
		secondClient.displayMoney();
		
		firstClient.sendMoney(1500, secondClient);
		
		firstClient.displayMoney();
		secondClient.displayMoney();
		
		firstClient.sendMoney(200, secondClient);
		
		firstClient.displayMoney();
		secondClient.displayMoney();
	}
}