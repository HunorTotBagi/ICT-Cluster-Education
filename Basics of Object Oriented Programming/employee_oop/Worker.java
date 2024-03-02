package employee_oop;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public abstract class Worker {
	private String firstName, lastName;
	private int jmbg, accountNumber, coef;
	
	
	public void readData(BufferedReader data) 
	{
		try {
			firstName = data.readLine();
			lastName = data.readLine();
			jmbg = data.readLine();
			accountNumber = data.readLine();
			coef = Double.parseDouble(data.readLine());
			
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void writeData() {
		
	}
	
	public abstract double calculateSalary(double laborPrice);
}
