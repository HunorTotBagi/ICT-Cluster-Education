package factoryVehicle;


public class VehicleFactory {
	public Vehicle getVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		}

		if (vehicleType == "Car") {
			return new Car();
		} else if (vehicleType == "Motocycle") {
			return new Motocycle();
		} else if (vehicleType == "Truck") {
			return new Truck();
		}
		return null;
	}
}
