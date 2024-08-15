package carWithCtor;

public class Car {
	private String brand,type, registration;
	private int year, maxSpeed, power;
	double price;
	
	Car () {}
	
	Car (String brand, String type, String registration, int year, int maxSpeed, int power) {
		this.setBrand(brand);
		this.setType(type);
		this.setRegistration(registration);
		this.setYear(year);
		this.setMaxSpeed(maxSpeed);
		this.setPower(power);
	}

	private void setPower(int power) {
		this.power = power;
	}
	
	private int getPower() {
		return this.power;
	}

	private void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	private int getMaxSeed() {
		return this.maxSpeed;
	}

	private void setYear(int year) {
		this.year = year;
	}
	
	private int getYear() {
		return this.year;
	}

	private void setRegistration(String registration) {
		this.registration = registration;
	}
	
	private String getRegistration() {
		return this.registration;
	}

	private void setType(String type) {
		this.type = type;
	}
	
	private String getType() {
		return this.type;
	}

	private void setBrand(String brand) {
		this.brand = brand;
	}
	
	private String getBrand() {
		return this.brand;
	}
	
	public double calculateCarValue() {
		return this.getMaxSeed() * this.getPower() / (2021 - this.getYear());
	}
	
    public void displayCarProperties() {
        System.out.printf("Car brand %s of type %s registered as %s in year %d with maximum speed %d and power %d have price %.2f%n",
                this.getBrand(), this.getType(), this.getRegistration(), this.getYear(), this.getMaxSeed(), this.getPower(), this.calculateCarValue());
    }

	
    public void compareCarPrice(double firstPrice, double secondPrice) {
        double difference = Math.abs(firstPrice - secondPrice);
        System.out.printf("The price difference is %.2f%n", difference);
    }
}
