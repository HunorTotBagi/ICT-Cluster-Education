package inventoryRecords;

import first_obligatory_homework.TextIO;

public class Classroom {
	private String name;
	private int numberOfDesks;
	private Computer[] computers;

	public Classroom() {
	}

	public Classroom(String name, int numberOfDesks) {
		this.setClassroomName(name);
		this.setNumberOfDesks(numberOfDesks);
		this.createComputerArray(numberOfDesks);
	}

	public void addComputer(Computer input) {

		int deskPosition;
		do {
			deskPosition = getValidInput(input);
			if (this.computers[deskPosition - 1] != null) {
				System.out.printf("Classroom %s: There is already a computer on desk %d! Try other one. ",
						this.getClassroomName(), deskPosition);
			}
		} while (this.computers[deskPosition - 1] != null);

		input.setDeskNumber(deskPosition - 1);
		this.computers[deskPosition - 1] = input;

		System.out.printf("Classroom %s: You successfully put in %s %s on desk number %d. %n %n",
				this.getClassroomName(), input.getBrand(), input.getModel(), deskPosition);
		this.displayComputers();
	}

	public void removeComputer(Computer input) {
		int deskNumber = input.getDeskNumber();
		System.out.printf("\nClassroom %s: Removing %s %s from desk %d in progress... %n", this.getClassroomName(),
				input.getBrand(), input.getModel(), deskNumber + 1);
		this.computers[deskNumber] = null;
		System.out.printf("\nClassroom %s: You successfully removed %s %s from desk number %d. %n %n",
				this.getClassroomName(), input.getBrand(), input.getModel(), deskNumber + 1);
		this.displayComputers();
	}

	public void displayComputers() {
		for (int i = 0; i < computers.length; i++) {
			if (computers[i] == null) {
				System.out.printf("Classroom %s: On desk %d there is: no computer %n", this.getClassroomName(), i + 1);
			} else {
				System.out.printf("Classroom %s: On desk %d there is: %s %s %n", this.getClassroomName(), i + 1,
						computers[i].getBrand(), computers[i].getModel());
			}
		}
	}

	private void createComputerArray(int numberOfDesks) {
		this.computers = new Computer[numberOfDesks];
	}

	private int getValidInput(Computer input) {
		int deskPosition;
		do {
			System.out.printf("\nClassroom %s: Enter on which deck you want to put %s %s: %n", this.getClassroomName(),
					input.getBrand(), input.getModel());
			deskPosition = TextIO.getlnInt();
			if (deskPosition < 1 || this.getNumberOfDesks() < deskPosition)
				System.out.println("Invalid input! Please try again.");
		} while (deskPosition < 1 || this.getNumberOfDesks() < deskPosition);
		return deskPosition;
	}

	public String getClassroomName() {
		return this.name;
	}

	public void setClassroomName(String name) {
		this.name = name;
	}

	public int getNumberOfDesks() {
		return numberOfDesks;
	}

	public void setNumberOfDesks(int numberOfClassrooms) {
		this.numberOfDesks = numberOfClassrooms;
	}
}