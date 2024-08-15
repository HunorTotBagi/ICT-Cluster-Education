package factoryVehicle;

public class Car extends Vehicle {
	private int numberOfDoors;

	public Car() {}

	public Car(String brand, String type, String registration, int year, Person owner, int numberOfDoors) {
		super(brand, type, registration, year, owner);
		this.setNumberOfDoors(numberOfDoors);
	}

	public void printCarData() {
		System.out.printf("Owner: %s %s - %s %s %s %d - Number of doors: %d %n", this.getOwner().getFirstName(),
				this.getOwner().getLastName(), this.getBrand(), this.getType(), this.getRegistration(), this.getYear(),
				this.getNumberOfDoors());
	}

	public int getNumberOfDoors() {
		return this.numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}