package byte_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileInputStream input = null;
		FileOutputStream output = null;

		try {
			input = new FileInputStream("inputByte.txt");
			output = new FileOutputStream("outputByte.txt");
			int byteValue;
			while ((byteValue = input.read()) != -1) {
				output.write(byteValue);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (input != null)
				input.close();

			if (output != null)
				output.close();
		}
	}
}
