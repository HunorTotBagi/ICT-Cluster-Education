package abstraction2;

public class Test {

	public static void main(String[] args) {
		Profesor profesorOne = new Profesor("Marko", "Markovic", 50, 3, "Vandredni profesor", 4);
		Assistant assistantOne = new Assistant("Jovan", "Jovanovic", 28, 4, "Marko Markovic", 3);
		NonTeachingWorker nonTeachingWorkerOne = new NonTeachingWorker("Milos", "Milakovic", 45, 5, "Obezbedjenje", 20);

		profesorOne.calculateSalary();
		assistantOne.calculateSalary();
		nonTeachingWorkerOne.calculateSalary();

		profesorOne.displaySalary();
		assistantOne.displaySalary();
		nonTeachingWorkerOne.displaySalary();

		System.out.println("");
		profesorOne.printPersonData();
		assistantOne.printPersonData();
		nonTeachingWorkerOne.printPersonData();
	}
}