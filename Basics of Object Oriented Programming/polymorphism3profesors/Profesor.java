package polymorphism3profesors;

public class Profesor extends Employee {
	private String jobTitle;
	private int SCIPapers;

	public Profesor() {}

	public Profesor(String firstName, String lastName, int age, double workingPlaceCoef, String jobTitle,
			int SCIPapers) {
		super(firstName, lastName, age, workingPlaceCoef);
		this.setJobTitle(jobTitle);
		this.setSCIPapers(SCIPapers);
	}

	public void calculateSalary() {
		this.setSalary(60000 + this.getSCIPapers() * 3000);
	}

	public void printPersonData() {
		System.out.printf("First name: %s %n", this.getFirstName());
		System.out.printf("Last name: %s %n", this.getLastName());
		System.out.printf("Age: %d %n", this.getAge());
		System.out.printf("Working place coefficient: %f %n", this.getWorkingPlaceCoef());
		System.out.printf("Job title: %s %n", this.getJobTitle());
		System.out.printf("Number of SCI papers: %d %n %n", this.getSCIPapers());
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSCIPapers() {
		return this.SCIPapers;
	}

	public void setSCIPapers(int sCIPapers) {
		SCIPapers = sCIPapers;
	}
}