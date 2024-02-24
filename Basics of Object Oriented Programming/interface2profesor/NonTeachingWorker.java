package interface2profesor;

public class NonTeachingWorker extends Employee implements Obracun {
	private String workingPlace;
	private int workExperience;

	public NonTeachingWorker() {
	}

	public NonTeachingWorker(String firstName, String lastName, int age, double workingPlaceCoef, String workingPlace,
			int workExperience) {
		super(firstName, lastName, age, workingPlaceCoef);
		this.workingPlace = workingPlace;
		this.workExperience = workExperience;

	}

	public void calculateSalary() {
		this.setSalary(30000 + this.getWorkExperience() * 500);
	}

	public void printPersonData() {
		System.out.printf("First name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Age: %s %n", this.getAge());
		System.out.printf("Working place coefficient: %f %n", this.getWorkingPlaceCoef());
		System.out.printf("Working place: %s", this.getWorkingPlace());
		System.out.printf("Work experience: %d %n %n", this.getWorkExperience());
	}

	public String getWorkingPlace() {
		return this.workingPlace;
	}

	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}

	public int getWorkExperience() {
		return this.workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
}