package x_complexTaskBank;

import java.util.ArrayList;

public class Bank implements WorkWithClients, WorkingWithTransactions {
	private ArrayList<Client> clients;
	private ArrayList<Transaction> transactions;
	private String name;

	public Bank(String name) {
		this.setName(name);
		this.setClients(new ArrayList<>());
		this.setTransactions(new ArrayList<>());
	}

	public void executeInternalTransaction(Transaction t) {
		if (t.getSender().getAccount().getBalance() < t.getAmmount()) {
			System.out.printf("\nTransaction failed!");
		} else {
			transactions.add(t);
			t.getSender().getAccount().setBalance(t.getSender().getAccount().getBalance() - t.getAmmount());
			t.getReceiver().getAccount().setBalance(t.getReceiver().getAccount().getBalance() + t.getAmmount());
			System.out.printf("\nTransaction successfully executed.");
		}
	}

	public void addClient(Client k) {
		this.getClients().add(k);
		System.out.printf("\nAdding client %s in progress...", k.getFirstName());
	}

	public void deleteCLient(Client k) {
		this.getClients().remove(k);
		System.out.printf("\nDeleting client %s in progress...", k.getFirstName());

	}

	public int findClient(String jmbg) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getJmbg() == jmbg) {
				return i;
			}
		}
		return -1;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}