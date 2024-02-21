package polymorphism3profesors;

public class Test {

	public static void main(String[] args) {
		Profesor firstProfesor = new Profesor("Marko", "Markovic",50, 3, "Vandredni profesor", 4);
		Assistant firstAssistant = new Assistant("Jovan", "Jovanovic", 28, 4, "Marko Markovic", 3);
		NonTeachingWorker firstNonTeachingWorker = new NonTeachingWorker("Milos", "Milakovic", 45, 5, "Obezbedjenje", 20);
		
		firstProfesor.calculateSalary();
		firstAssistant.calculateSalary();
		firstNonTeachingWorker.calculateSalary();
		
		firstProfesor.displaySalary();
		firstAssistant.displaySalary();
		firstNonTeachingWorker.displaySalary();
		
		System.out.println("");
		
		firstProfesor.printPersonData();
		firstAssistant.printPersonData();
		firstNonTeachingWorker.printPersonData();
	}
}