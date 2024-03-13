package a05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class biteCopying {

	public static void main(String[] args) throws IOException {
		FileInputStream input = null;
		FileOutputStream output = null;

		try {
			input = new FileInputStream("a.txt");
			output = new FileOutputStream("b.txt");

			int c;
			while ((c = input.read()) != -1) {
				output.write(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (input != null) {
				input.close();
			}

			if (output != null) {
				output.close();
			}
		}
	}
}