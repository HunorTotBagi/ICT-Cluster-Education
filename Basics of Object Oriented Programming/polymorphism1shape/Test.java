package polymorphism1shape;

public class Test {

	public static void main(String[] args) {
		Square firstSquare = new Square("Yellow", "Square", 10);
		Circle firstCircle = new Circle("Red", "Circle", 4);
		
		firstSquare.calculateArea();
		firstCircle.calculateArea();
		
		firstSquare.calculateCircumference();
		firstCircle.calculateCircumference();
		
		firstSquare.displayData();
		firstCircle.displayData();
		
		System.out.println("");
		
		firstSquare.changeColor("Blue");
		firstCircle.changeColor("White");
		
		System.out.println("");

		firstSquare.displayData();
		firstCircle.displayData();
	}
}