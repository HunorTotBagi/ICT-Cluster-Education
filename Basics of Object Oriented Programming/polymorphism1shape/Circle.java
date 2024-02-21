package polymorphism1shape;

public class Circle extends Shape {
	private double radius;

	public Circle() {}

	public Circle(String color, String type, double radius) {
		super(color, type);
		this.setRadius(radius);
	}

	public void calculateArea() {
		this.setArea(Math.PI * this.getRadius() * this.getRadius());
	}
	
	public void calculateCircumference() {
		this.setCircumference(2 * Math.PI * this.getRadius());
	}

	public void displayData() {
		System.out.printf("Color: %s | Shape: %s | Area: %.2f | Circumference: %.2f %n", this.getColor(), this.getType(), this.getArea(), this.getCircumference());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}