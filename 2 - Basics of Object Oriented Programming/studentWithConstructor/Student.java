package studentWithConstructor;

public class Student {
	
	private String firstName, lastName;
	private double firstTestPoints, secondTestPoints;
	
	public Student(String firstName, String lastName, double firstTestPoints, double secondTestPoints) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setFirstTestPoints(firstTestPoints);
		this.setSecondTestPoints(secondTestPoints);
	}

	private void setSecondTestPoints(double secondTestPoints) {
		this.secondTestPoints = secondTestPoints;
	}

	private void setFirstTestPoints(double firstTestPoints) {
		this.firstTestPoints = firstTestPoints;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	private double getSecondTestPoints() {
		return this.secondTestPoints;
	}
	
	private double getFirstTestPoints() {
		return this.firstTestPoints;
	}
	
	private String getLastName() {
		return this.lastName;
	}
	
	private String getFirstName() {
		return this.firstName;
	}
	
	public double calculateScore() {
		return (this.getFirstTestPoints() + this.getSecondTestPoints()) / 2;
	}
	
	public void displayScore() {
		System.out.printf("Student %s %s achieved %f score. %n", this.getFirstName(), this.getLastName(), this.calculateScore());
	}
}