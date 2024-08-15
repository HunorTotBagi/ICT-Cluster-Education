package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your JMBG: ");
		String jmbg = sc.next();
		System.out.println("Enter your first name: ");
		String firstName = sc.next();
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		System.out.printf("JMBG: %s | First Name: %s | Salary: %.2f", jmbg, firstName, salary );
		sc.close(); 
	}
}