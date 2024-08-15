package employee_oop;

import java.io.IOException;
import java.io.BufferedReader;

public class ActiveWorker extends Worker {
	private double variableCoef;

	public void readData(BufferedReader data) {
		try {
			super.readData(data);
			variableCoef = Double.parseDouble(data.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public double calculateSalary(double laborPrice) {
		return (educationCoef + variableCoef) * laborPrice;
	}
}
