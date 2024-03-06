package mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class QuadraticFunction implements Function {
	private double a, b, c;

	public void loadParameters(BufferedReader inputData) throws IOException {
		a = Double.parseDouble(inputData.readLine());
		b = Double.parseDouble(inputData.readLine());
		c = Double.parseDouble(inputData.readLine());
	}

	public double calculateValueAt(double x) {
		return a * x * x + b + c;
	}

	public Boolean hasRealZeros() {
		return getDiscriminant() < 0 ? false : true;
	}

	public double findFirstZero() {
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	private double findSecondZero() {
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}

	private double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	public void writeData(BufferedWriter outputData) {
		try {
			outputData.write(Double.valueOf(findFirstZero()).toString());
			outputData.newLine();
			outputData.write(Double.valueOf(findSecondZero()).toString());
			System.out.println("Quadratic zero wrote in file.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}