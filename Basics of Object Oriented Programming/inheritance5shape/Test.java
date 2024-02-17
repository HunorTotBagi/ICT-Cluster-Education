package inheritance5shape;

public class Test {

	public static void main(String[] args) {
		Shape firstShape = new Shape("red", "triangle", 3);

		Square firstSquare = new Square("yellow", "square", 4, 10);
		Circle firstCircle = new Circle("red", "circle", 0, 4);

		firstShape.printData();
		firstShape.changeColor("blue");
		firstShape.printData();

		firstSquare.calculateArea();
		firstSquare.printData();

		firstCircle.calculateArea();
		firstCircle.printData();
	}
}