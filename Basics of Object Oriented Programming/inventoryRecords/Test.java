package inventoryRecords;

public class Test {

	public static void main(String[] args) {
		Computer firstComputer = new Computer("LN123456789", "Dell", "Latitude 7410", 16, 512);
		Computer secondComputer = new Computer("GD789012345", "Alienware", "Aurora R10", 32, 1024);
		Computer thirdComputer = new Computer("HD456789012", "HP", "Pavilion TP01-0066", 8, 256);
		Computer fourthComputer = new Computer("SL678901234", "Lenovo", "ThinkPad E15", 8, 256);

		Computer fifthComputer = new Computer("AS123456789", "Asus", "ROG Strix G15", 16, 512);
		Computer sixthComputer = new Computer("MS789012345", "Microsoft", "Surface Laptop 4", 16, 512);

		Classroom firstClassroom = new Classroom("8B", 4);
		Classroom secondClassroom = new Classroom("4C", 2);

		firstClassroom.displayComputers();
		firstClassroom.addComputer(firstComputer);
		firstClassroom.addComputer(secondComputer);
		firstClassroom.removeComputer(firstComputer);

		secondComputer.compareMemory(thirdComputer);
		thirdComputer.compareMemory(firstComputer);

		firstClassroom.addComputer(thirdComputer);
		firstClassroom.addComputer(fourthComputer);
		firstClassroom.addComputer(firstComputer);

		secondClassroom.addComputer(fifthComputer);
		secondClassroom.addComputer(sixthComputer);
	}
}