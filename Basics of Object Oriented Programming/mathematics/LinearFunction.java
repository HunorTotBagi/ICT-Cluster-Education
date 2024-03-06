package mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author Hunor Tot-Bagi <hunortotbagi@gmail.com>
 * @version 1.0
 */
public class LinearFunction implements Function {
	private double a, b;

	public void loadParameters(BufferedReader inputData) throws IOException {
		a = Double.parseDouble(inputData.readLine());
		b = Double.parseDouble(inputData.readLine());
	}

	/**
	 * 	@return Returns the value of the function at value x.
	 */
	public double calculateValueAt(double x) {
		return a * x + b;
	}

	public Boolean hasRealZeros() {
		return b == 0 ? false : true;
	}

	public double findFirstZero() {
		return -b / a;
	}

	public void writeData(BufferedWriter outputData) {
		try {
			outputData.write(Double.valueOf(findFirstZero()).toString());
			System.out.println("Zero wrote in the file.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}