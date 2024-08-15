package ulaz_izlal;

public class Zadatak2 {

	public static void main(String[] args) {

		double investicija;
		double stopa;
		double zarada;

		System.out.print("Unesite vrednost investicije: ");
		investicija = TextIO.getlnDouble();

		System.out.print("Unesite vrednost kamatne stope: ");
		stopa = TextIO.getlnDouble();

		zarada = investicija * stopa;
		investicija = investicija + zarada;

		System.out.println("Za godinu dana zaradjeno je: " + zarada + " dinara.");
		System.out.println("Ukupna vrednost investije je sada: " + investicija + " dinara.");

	}
}