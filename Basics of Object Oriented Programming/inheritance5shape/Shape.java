package inheritance5shape;

public class Shape {
	protected String color, type;
	protected int numberOfSides;
	protected double area;

	public Shape() {}

	public Shape(String color, String type, int numberOfSides) {
		this.setColor(color);
		this.setType(type);
		this.setNumberOfSides(numberOfSides);
	}

	public void changeColor(String newColor) {
		this.setColor(newColor);
	}

	public void printData() {
		System.out.printf("Color: %s | Shape: %s | Number of sides: %d | Area: %f %n", this.getColor(), this.getType(),
				this.getNumberOfSides(), this.getArea());
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfSides() {
		return this.numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}