package mathematics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public interface Function {
	public void loadParameters(BufferedReader inputData) throws IOException;

	public double calculateValueAt(double x);

	public Boolean hasRealZeros();

	public double findFirstZero();

	public void writeData(BufferedWriter outputData);
}
