package inheritance4vehicles;

public class Truck extends Vehicle {
	private int numberOfAxels;

	public Truck() {}

	public Truck(String brand, String type, String registration, int year, Person owner, int numberOfAxels) {
		super(brand, type, registration, year, owner);
		this.setNumberOfAxels(numberOfAxels);
	}

	public void printTruckData() {
		System.out.printf("Owner: %s %s - %s %s %s %d - Number of axels: %d %n", this.getOwner().getFirstName(),
				this.getOwner().getLastName(), this.getBrand(), this.getType(), this.getRegistration(), this.getYear(),
				this.getNumberOfAxels());
	}

	public int getNumberOfAxels() {
		return numberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}
}