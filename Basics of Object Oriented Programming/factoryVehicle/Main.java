package factoryVehicle;

public class Main {

	public static void main(String[] args) {
		Person firstPerson = new Person("Hunor", "Tot-Bagi", 31);
		Person secondPerson = new Person("Nikola", "Nikolic", 27);
		Person thirdPerson = new Person("Marko", "Markovic", 40);
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car1 = vehicleFactory.getVehicle("Car");

		Vehicle firstVehicle = new Vehicle("Toyota", "Sedan", "ABC123", 2020, firstPerson);
		Vehicle secondVehicle = new Vehicle("Ford", "SUV", "XYZ456", 2018, secondPerson);

		Car firstCar = new Car("Ford", "SUV", "XYZ456", 2018, secondPerson, 4);
		Truck firstTruck = new Truck("Ford", "Pickup", "ABC123", 2015, thirdPerson, 8);
		Motocycle firstMotocycle = new Motocycle("Harley-Davidson", "Cruiser", "DEF789", 2020, firstPerson, true, 200);
		Motocycle secondMotocycle = new Motocycle("Kawasaki", "xyz", "DEF789", 2020, thirdPerson, true, 800);

		firstVehicle.printVehicleData();
		secondVehicle.printVehicleData();

		secondVehicle.changeOwner(firstPerson);

		firstVehicle.printVehicleData();
		secondVehicle.printVehicleData();

		System.out.println("");

		firstCar.printCarData();
		firstTruck.printTruckData();
		firstMotocycle.printMotocycleData();

		System.out.println("");

		firstMotocycle.printMotocycleData();
		secondMotocycle.printMotocycleData();

		firstMotocycle.changeOwner(secondPerson);

		firstMotocycle.printMotocycleData();
		secondMotocycle.printMotocycleData();
	}
}