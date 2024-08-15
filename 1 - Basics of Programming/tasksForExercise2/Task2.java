package tasksForExercise2;

public class Task2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;

		System.out.printf("The value of variable a is: %d %n", a);
		System.out.printf("The value of variable b is: %d %n", b);

		int temp = b;
		b = a;
		a = temp;

		System.out.println("");
		System.out.println("Swapping variables in progres...");
		System.out.println("");

		System.out.printf("The value of variable a is now: %d %n", a);
		System.out.printf("The value of variable b is now: %d %n", b);
	}
}