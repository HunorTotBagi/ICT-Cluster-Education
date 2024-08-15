package abstraction2;

public class Assistant extends Employee {
	public String mentor;
	public int yearOfDoctoralStudies;

	public Assistant() {}

	public Assistant(String firstName, String lastName, int age, double workingPlaceCoef, String mentor,
			int yearOfDoctoralStudies) {
		super(firstName, lastName, age, workingPlaceCoef);
		this.setMentor(mentor);
		this.setYearOfDoctoralStudies(yearOfDoctoralStudies);
	}

	public void calculateSalary() {
		this.setSalary(40000 + this.getYearOfDoctoralStudies() * 2000);
	}

	public void printPersonData() {
		System.out.printf("First name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Age: %s %n", this.getAge());
		System.out.printf("Working place coefficient: %f %n", this.getWorkingPlaceCoef());
		System.out.printf("Mentor: %s %n", this.getMentor());
		System.out.printf("Year of doctoral studies: %d %n %n", this.getYearOfDoctoralStudies());
	}

	public String getMentor() {
		return this.mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public int getYearOfDoctoralStudies() {
		return this.yearOfDoctoralStudies;
	}

	public void setYearOfDoctoralStudies(int yearOfDoctoralStudies) {
		this.yearOfDoctoralStudies = yearOfDoctoralStudies;
	}
}