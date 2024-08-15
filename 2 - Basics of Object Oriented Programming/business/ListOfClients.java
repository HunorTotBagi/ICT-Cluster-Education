package business;

public class ListOfClients {
	private String[] name;
	private int currentNumberOfClients, maxNumberOfClients;

	public ListOfClients() {
	}

	public ListOfClients(int maxNumberOfClients) {
		this.setMaxNumberOfClients(maxNumberOfClients);
		this.setCurrentNumberOfClients(0);
		this.setName(new String[maxNumberOfClients]);
	}

	public String findClient(String name) {
		for (int i = 0; i < this.getCurrentNumberOfClients(); i++) {
			if (this.name[i] == name) {
				return this.name[i];
			}
		}
		return ("Client is not found!");
	}

	public void addClient(String name) {
		if (this.getCurrentNumberOfClients() < this.getMaxNumberOfClients()) {
			this.name[this.currentNumberOfClients] = name;
			this.setCurrentNumberOfClients(this.getCurrentNumberOfClients() + 1);
		} else {
			System.out.printf("There are no more space left on the list!");
		}
	}

	public String[] getName() {
		return this.name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int getCurrentNumberOfClients() {
		return this.currentNumberOfClients;
	}

	public void setCurrentNumberOfClients(int currentNumberOfClients) {
		this.currentNumberOfClients = currentNumberOfClients;
	}

	public int getMaxNumberOfClients() {
		return this.maxNumberOfClients;
	}

	public void setMaxNumberOfClients(int maxNumberOfClients) {
		this.maxNumberOfClients = maxNumberOfClients;
	}
}
