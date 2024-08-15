package inheritance2;

public class Student extends Person {
	private int idNumber;
	private double firstTestPoints, secondTestPoints, average;

	public Student() {}

	public Student(String firstName, String lastName, int age, int idNumber, double firstTestPoints, double secondTestPoints) {
		super(firstName, lastName, age);
		this.setIdNumber(idNumber);
		this.setFirstTestPoints(firstTestPoints);
		this.setSecondTestPoints(secondTestPoints);
	}

	public void calculateAverage() {
		System.out.printf("\nCalculating average for student %s %s in progress...", this.getFirstName(), this.getLastName());
		this.setAverage((this.getFirstTestPoints() + this.getSecondTestPoints()) / 2);
	}

	public void displayAverage() {
		System.out.printf("\nStudent %s %s with ID: %d got %.2f points. %n", this.getFirstName(), this.getLastName(), this.getIdNumber(), this.getAverage());
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public double getFirstTestPoints() {
		return this.firstTestPoints;
	}

	public void setFirstTestPoints(double firstTestPoints) {
		this.firstTestPoints = firstTestPoints;
	}

	public double getSecondTestPoints() {
		return this.secondTestPoints;
	}

	public void setSecondTestPoints(double secondTestPoints) {
		this.secondTestPoints = secondTestPoints;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}

	public double getAverage() {
		return this.average;
	}
}