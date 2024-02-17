package inheritance5shape;

public class Square extends Shape {
	private double sideLength;

	public Square() {}

	public Square(String color, String type, int numberOfSides, double sideLength) {
		super(color, type, numberOfSides);
		this.setSideLength(sideLength);
	}

	public void calculateArea() {
		this.setArea(this.getSideLength() * this.getSideLength());
	}

	public double getSideLength() {
		return this.sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
}