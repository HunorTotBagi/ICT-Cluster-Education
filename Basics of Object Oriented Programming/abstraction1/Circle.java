package abstraction1;

public class Circle extends Shape {
	private double radius;

	public Circle() {}

	public Circle(String color, String type, double radius) {
		super(color, type);
		this.setRadius(radius);
	}

	public void calculateArea() {
		this.setArea(this.getRadius() * this.getRadius() * Math.PI);
	}

	public void calculateCircumference() {
		this.setCircumference(2 * Math.PI * this.getRadius());
	}

	public void displayData() {
		System.out.printf("Shape: %s | Color: %s | Area: %.2f | Circumference: %.2f %n", this.getType(),
				this.getColor(), this.getArea(), this.getCircumference());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}