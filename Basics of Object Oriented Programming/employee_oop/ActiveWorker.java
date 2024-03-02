package employee_oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ActiveWorker extends Worker{
	private int variableCoef;
	
	public void readData(BufferedReader data) {
		try {
			super.readData(data);
			variableCoef = Double.parseDouble(data.readLine());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public double calculateSalary(double laborPrice) {
		return (coef + variableCoef);
	}

	}
}
