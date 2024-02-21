package polymorphism1shape;

public class Square extends Shape {
	private double sideLength;

	public Square() {}

	public Square(String color, String type, double sideLength) {
		super(color, type);
		this.setSideLength(sideLength);
	}

	public void calculateArea() {
		this.setArea(this.getSideLength() * this.getSideLength());
	}
	
	public void calculateCircumference() {
		this.setCircumference(4 * this.getSideLength());
	}
	
	public void displayData() {
		System.out.printf("Color: %s | Shape: %s | Area: %.2f | Circumference: %.2f %n", this.getColor(), this.getType(), this.getArea(), this.getCircumference());
	}

	public double getSideLength() {
		return this.sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
}