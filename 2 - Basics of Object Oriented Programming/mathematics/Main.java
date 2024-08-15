package mathematics;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		Function linear = new LinearFunction();
		Function quadratic = new QuadraticFunction();

		BufferedReader linearFunctionInput = null;
		BufferedReader quadraticFunctionInput = null;
		BufferedWriter linearFunctionOutput = null;
		BufferedWriter quadraticFunctionOutput = null;

		try {
			linearFunctionInput = new BufferedReader(new FileReader("function1.txt"));
			linearFunctionOutput = new BufferedWriter(new FileWriter("function1zero.txt"));

			quadraticFunctionInput = new BufferedReader(new FileReader("function2.txt"));
			quadraticFunctionOutput = new BufferedWriter(new FileWriter("function2zero.txt"));

			linear.loadParameters(linearFunctionInput);
			quadratic.loadParameters(quadraticFunctionInput);

			if (linear.hasRealZeros())
				linear.writeData(linearFunctionOutput);

			if (quadratic.hasRealZeros())
				quadratic.writeData(quadraticFunctionOutput);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (linearFunctionInput != null)
				linearFunctionInput.close();
			if (quadraticFunctionInput != null)
				quadraticFunctionInput.close();
			if (linearFunctionOutput != null)
				linearFunctionOutput.close();
			if (quadraticFunctionOutput != null)
				quadraticFunctionOutput.close();
		}
	}
}
