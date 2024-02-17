package inheritance2;

public class Student extends Person {
	private int idNumber;
	private double firstTestPoints, secondTestPoints, average;

	public Student() {
	}

	public Student(String firstName, String lastName, int age, int idNumber, double firstTestPoints,
			double secondTestPoints) {
		
		super(firstName, lastName, age);
		this.setIdNumber(idNumber);
		this.setFirstTestPoints(firstTestPoints);
		this.setSecondTestPoints(secondTestPoints);
	}

	public void calculateAverageScore() {
		this.average = (this.getFirstTestPoints() + this.getSecondTestPoints()) / 2;
	}

	public void printScore() {
		System.out.printf("\nStudent %s %s with id number %d got %.2f points", this.getFirstName(), this.getLastName(),
				this.getIdNumber(), this.getAverage());
	}

	public double getAverage() {
		return this.average;
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
}