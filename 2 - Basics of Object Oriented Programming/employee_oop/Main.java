package employee_oop;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		double workPrice;
		int numberOfWorkers;

		BufferedReader input = null;
		BufferedWriter output = null;

		try {
			input = new BufferedReader(new FileReader("listOfEmployees.txt"));
			output = new BufferedWriter(new FileWriter("salaries.txt"));

			workPrice = getWorkPrice(input);
			numberOfWorkers = getNumberOfWorkers(input);

			processWorkers(input, output, workPrice, numberOfWorkers);
			System.out.println("Salaries.txt file is ready!");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (input != null)
				input.close();
			if (output != null)
				output.close();
		}
	}

	private static void processWorkers(BufferedReader bufferedInput, BufferedWriter bufferedOutput, double workPrice,
			int numberOfWorkers) throws IOException {
		String sign;
		for (int i = 0; i < numberOfWorkers; i++) {
			sign = bufferedInput.readLine();
			Worker worker;

			if (sign.startsWith("+")) {
				worker = new ActiveWorker();
			} else {
				worker = new SickLeaveWorker();
			}
			worker.readData(bufferedInput);
			worker.writeData(bufferedOutput, workPrice);
		}
	}

	private static int getNumberOfWorkers(BufferedReader bufferedInput) throws IOException {
		return Integer.parseInt(bufferedInput.readLine());
	}

	private static double getWorkPrice(BufferedReader bufferedInput) throws IOException {
		return Double.parseDouble(bufferedInput.readLine());
	}
}