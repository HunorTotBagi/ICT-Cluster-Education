package operatori;

public class Zadatak3 {

	public static void main(String[] args) {
		
		double n = 1;
		double T = 36;
		double V = 20;
		
		final double R = 8.314472;
		
		double pritisakIdealnogGasa = n * R * T/V;
		
		System.out.println("Pritisak idealnog gasa iznosi: " + pritisakIdealnogGasa);
		
	}
}