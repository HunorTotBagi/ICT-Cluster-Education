package a02;

public class Student {
	private String firstName, lastName;
	private double pointsFromFirstTest, pointsFromSecondTest, averagePoints;

	public Student(String firstName, String lastName, double pointsFromFirstTest, double pointsFromSecondTest) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPointsFromFirstTest(pointsFromFirstTest);
		this.setPointsFromSecondTest(pointsFromSecondTest);
	}

	public void calculateAveragePoints() {
		double sumOfPoints = this.getPointsFromFirstTest() + this.getPointsFromSecondTest();
		this.setAveragePoints(sumOfPoints / 2);
	}

	public void printAveragePoints() {
		System.out.printf("Average points for student %s %s: %.2f %n", this.getFirstName(), this.getLastName(),
				this.getAveragePoints());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPointsFromFirstTest() {
		return pointsFromFirstTest;
	}

	public void setPointsFromFirstTest(double pointsFromFirstTest) {
		this.pointsFromFirstTest = pointsFromFirstTest;
	}

	public double getPointsFromSecondTest() {
		return pointsFromSecondTest;
	}

	public void setPointsFromSecondTest(double pointsFromSecondTest) {
		this.pointsFromSecondTest = pointsFromSecondTest;
	}

	public double getAveragePoints() {
		return averagePoints;
	}

	public void setAveragePoints(double averagePoints) {
		this.averagePoints = averagePoints;
	}
}
