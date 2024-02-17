package clientBank;

public class Test {

	public static void main(String[] args) {
		
		Client firstClient = new Client("Hunor", "Tot-Bagi", "hunortotbagi@gmail.com", "32154818654613", "legal entity", 500);
		Client secondClient = new Client("Nikola", "Nikolic", "nikola.nikolic@gmail.com", "52154808654113", "legal entity", 850);
		
		firstClient.displayAccountBalance();
		firstClient.withdrawMoney(600);
		firstClient.withdrawMoney(450);
		firstClient.depositMoney(200);
		
		System.out.printf("~~~ Hunor sends 150 to Nikola ~~~ %n %n");
		
		firstClient.sendMoney(150, secondClient);

	}
}