package inheritance5shape;

public class Circle extends Shape {
	private double radius;

	public Circle() {}

	public Circle(String color, String type, int numberOfSides, double radius) {
		super(color, type, numberOfSides);
		this.setRadius(radius);
	}

	public void calculateArea() {
		this.setArea(this.getRadius() * this.getRadius() * 3.14);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}