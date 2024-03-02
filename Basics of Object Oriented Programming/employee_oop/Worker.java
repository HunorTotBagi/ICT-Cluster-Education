package employee_oop;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public abstract class Worker {

	protected String firstName, lastName, jmbg, account;
	protected double educationCoef;

	public void readData(BufferedReader data) {
		try {
			firstName = data.readLine();
			lastName = data.readLine();
			jmbg = data.readLine();
			account = data.readLine();
			educationCoef = Double.parseDouble(data.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void writeData(BufferedWriter data, double workPrice) {
		try {
			data.write(firstName);
			data.newLine();
			data.write(lastName);
			data.newLine();
			data.write(account);
			data.newLine();
			data.write(Double.valueOf(calculateSalary(workPrice)).toString());
			data.newLine();
			data.newLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public abstract double calculateSalary(double workPrice);
}