package x_complexTaskBank;

public class Main {

	public static void main(String[] args) {
		Client clientHunor = new Client("Hunor", "Tot-Bagi", "12345", 500f, "Euro", "654654654", true);
		Client clientIvan = new Client("Ivan", "Tancik", "987987", 1000f, "Euro", "879865498", true);
		
		clientHunor.printClientData();
		clientIvan.printClientData();
		
		Bank otp = new Bank("OTP");
		
		otp.addClient(clientHunor);
		otp.addClient(clientIvan);
		
		Transaction failedTransaction = new Transaction(clientIvan, clientHunor, 700f, true);
		
		System.out.println("");
		otp.executeInternalTransaction(failedTransaction);
		System.out.println("");
		
		clientHunor.printClientData();
		clientIvan.printClientData();
		
		Transaction legal = new Transaction(clientIvan, clientHunor, 400, true);
		
		otp.executeInternalTransaction(legal);
		System.out.println("");
		
		clientHunor.printClientData();
		clientIvan.printClientData();
		
		Client clientPerica = new Client("Perica", "Perisic", "65464", 0f, "Euro", "852258", true);
		
		otp.addClient(clientPerica);
		System.out.println("");
		System.out.printf("Perica is on position %d %n", otp.findClient("65464"));
		
		otp.deleteCLient(clientPerica);
		System.out.println("");
		System.out.printf("Perica is on position %d", otp.findClient("65464"));
		
		Client clientDragan = new Client("Dragan", "Perisic", "999", 0f, "Euro", "852258", true);
		
		otp.deleteCLient(clientDragan);
	}
}
