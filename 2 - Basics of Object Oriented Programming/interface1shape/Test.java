package interface1shape;

public class Test {

	public static void main(String[] args) {
		Square squareOne = new Square("Yellow", "square", 10);
		Circle circleOne = new Circle("Red", "circle", 4);

		squareOne.calculateArea();
		squareOne.calculateCircumference();

		circleOne.calculateArea();
		circleOne.calculateCircumference();

		squareOne.displayData();
		circleOne.displayData();

		System.out.println("");
		squareOne.changeColor("Blue");
		squareOne.displayData();

		System.out.println("");
		circleOne.changeColor("White");
		circleOne.displayData();
	}
}