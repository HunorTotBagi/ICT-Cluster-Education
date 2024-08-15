package factoryVehicle;

public class Vehicle {
	protected String brand, type, registration;
	protected int year;
	protected Person owner;
	protected Motocycle powerUnit;

	public Vehicle() {}

	public Vehicle(String brand, String type, String registration, int year, Person owner) {
		this.setBrand(brand);
		this.setType(type);
		this.setRegistration(registration);
		this.setYear(year);
		this.setOwner(owner);
	}

	public void changeOwner(Person newOwner) {
		System.out.printf("\nChangeing ownership in progress...%n %n");
		this.setOwner(newOwner);
	}

	public void printVehicleData() {
		System.out.printf("Owner: %s %s - %s %s %s %d%n", this.getOwner().getFirstName(), this.getOwner().getLastName(),
				this.getBrand(), this.getType(), this.getRegistration(), this.getYear());
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistration() {
		return this.registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Person getOwner() {
		return this.owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}