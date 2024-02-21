package polymorphism1shape;

public class Shape {
	protected String color, type;
	protected int numberOfSides;
	protected double area, circumference;

	public Shape() {}
	
	public Shape(String color, String type) {
		this.setColor(color);
		this.setType(type);
	}

	public Shape(String color, String type, int numberOfSides) {
		this.setColor(color);
		this.setType(type);
		this.setNumberOfSides(numberOfSides);
	}

	public void changeColor(String inputColor) {
		System.out.printf("Color change for %s in progress...%n", this.getType());
		this.setColor(inputColor);
	}

	public void displayData() {
		System.out.printf("Color: %s | Shape: %s | Number of sides: %d %n", this.getColor(), this.getType(), this.getNumberOfSides());
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
	public double getCircumference() {
		return this.circumference;
	}
	
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}