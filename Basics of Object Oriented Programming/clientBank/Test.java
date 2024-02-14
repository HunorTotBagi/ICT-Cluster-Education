package clientBank;

public class Test {

	public static void main(String[] args) {
		Client firstClient = new Client("Hunor", "Tot-Bagi", "102411", "hunortotbagi@gmail.com",
				"32154818654613", "legal entity", 500);
		
		Client secondClient = new Client("Nikola", "Nikolic", "102411", "nikola.nikolic@gmail.com",
				"52154808654113", "legal entity", 850);
		
		firstClient.displayAccountBalance();
		firstClient.withdrawMoney(600);
		firstClient.withdrawMoney(450);
		firstClient.depositMoney(200);
		
		System.out.printf("~~~ Hunor sends 150 to Nikola ~~~ %n %n");
		
		firstClient.sentMoney(150, secondClient);

	}
}