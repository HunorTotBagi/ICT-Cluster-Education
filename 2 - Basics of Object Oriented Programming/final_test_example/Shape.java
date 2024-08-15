package final_test_example;

public abstract class Shape {
	private String color, type;
	private int numberOfSides;
	
	public Shape() {}
	
	public Shape(String color, String type, int numberOfSides) {
		this.setColor(color);
		this.setType(type);
		this.setNumberOfSides(numberOfSides);
	}
	
	public abstract double calculateArea();
	
	public abstract double calculateCircumference();
	
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
	
}
