package factoryVehicle;

public class Motocycle extends Vehicle {
	private Boolean registered;

	public Motocycle() {}

	public Motocycle(String brand, String type, String registration, int year, Person owner, Boolean registered, int power) {
		super(brand, type, registration, year, owner);
		this.registered = registered;
	}

	public void printMotocycleData() {
		System.out.printf("Owner: %s %s - %s %s %s %d - Motorcycle registered: %b AND %n", this.getOwner().getFirstName(),
				this.getOwner().getLastName(), this.getBrand(), this.getType(), this.getRegistration(), this.getYear(),
				this.getRegistered());
	}

	public Boolean getRegistered() {
		return this.registered;
	}

	public void setRegistered(Boolean registered) {
		this.registered = registered;
	}
}