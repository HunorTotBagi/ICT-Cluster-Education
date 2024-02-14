package carWithCtor;

public class Test {

	public static void main(String[] args) {
		Car firstCar = new Car("Zastava", "101", "ASD-432", 1996, 90, 500);
		Car secondCar = new Car("BMW", "123", "NS-555", 2006, 150, 1000);
		
		firstCar.calculateCarValue();
		secondCar.calculateCarValue();
		
		firstCar.displayCarProperties();
		secondCar.displayCarProperties();
		
		firstCar.compareCarPrice(firstCar.calculateCarValue(), secondCar.calculateCarValue());
		
	}
}