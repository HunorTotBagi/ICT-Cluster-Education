package zadaci_za_vežbanje_1;

public class Zadatak3 {

	public static void main(String[] args) {
		
		double radius = 20;
		final double PI = 3.14;
		
		double povrsinaKruga = Math.pow(radius, 2) * PI;
		double obimKruga = 2 * radius * PI;
		
		System.out.println("Povrsina kruga je: " + povrsinaKruga);
		System.out.println("Obim kruga je: " + obimKruga);
	}
}