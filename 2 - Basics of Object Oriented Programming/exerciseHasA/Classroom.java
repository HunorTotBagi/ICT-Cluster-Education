package exerciseHasA;

public class Classroom {
	protected String mark, type;
	protected int numberOfSeats;
	protected double area;
	
	public Classroom(String mark, String type, int numberOfSeats, double area) {
		this.setMark(mark);
		this.setType(type);
		this.setNumberOfSeats(numberOfSeats);
		this.setArea(area);
	}
	
	public String toString() {
		return mark + " (" + type + "), number of seats: " + numberOfSeats + ", area: " + area + " m2";
	}
	
	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}