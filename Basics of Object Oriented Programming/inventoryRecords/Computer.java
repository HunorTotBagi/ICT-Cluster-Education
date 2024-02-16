package inventoryRecords;

public class Computer {
	private String serialNumber, brand, model;
	private int memory, storage, deskNumber;

	public Computer() {
	}

	public Computer(String serialNumber, String brand, String model, int memory, int storage) {
		this.setSerialNumber(serialNumber);
		this.setBrand(brand);
		this.setModel(model);
		this.setMemory(memory);
		this.setStorage(storage);
	}

	public void compareMemory(Computer input) {
		if (this.getMemory() > input.getMemory()) {
			System.out.printf("\n%s %s (%dGB) has more memory than %s %s (%dGB).%n", this.getBrand(), this.getModel(),
					this.getMemory(), input.getBrand(), input.getModel(), input.getMemory());
		} else {
			System.out.printf("\n%s %s (%dGB) has more memory than %s %s (%dGB).%n", input.getBrand(), input.getModel(),
					input.getMemory(), this.getBrand(), this.getModel(), this.getMemory());
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMemory() {
		return this.memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorage() {
		return this.storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}

	public int getDeskNumber() {
		return this.deskNumber;
	}
}