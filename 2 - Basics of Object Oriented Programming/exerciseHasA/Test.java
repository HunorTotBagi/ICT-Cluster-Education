package exerciseHasA;

public class Test {

	public static void main(String[] args) {
		Employee legalPerson = new Employee("Nikola", "Nikolic", 34, 5);
		Institution facultyOfSciences = new Institution("Faculty of Sciences", "Trg Dositeja Obradovića 3", "08104620", legalPerson);
		
		facultyOfSciences.addClassroom("A1", "Computer room", 10, 30);
		facultyOfSciences.addEmployee("Isaac", "Newton", 50, 999);
		
		facultyOfSciences.printArray();
	}
}