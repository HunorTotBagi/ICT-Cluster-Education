package operatori;

public class Zadatak2 {

	public static void main(String[] args) {
		
		double l = 2;
		double d = 123;
		
		final double PI = 3.41;
		final double RCu = 1.588 * Math.pow(10, -8);
		
		double otpornostBakarnogProvodnika = RCu * 4 * l / (d * d * PI);
		
		System.out.println("Otpornost bakarnog provodnika iznosi: " + otpornostBakarnogProvodnika);
		
	}
}