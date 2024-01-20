package prvi_projekat;

public class TrazenjeGresaka {

	public static void main(String[] args) {

		double investicija; 
		double stopa; 
		investicija = 1000;
		stopa = 0.027;
		double zarada = investicija * stopa; // Compute the interest.
		investicija = investicija + zarada;

		System.out.print("Za godinu dana zaradjeno je: ");
		System.out.print(zarada);
		System.out.println(" dinara.");
		System.out.print("Ukupna vrednost investije je sada: ");
		System.out.print(investicija);
		System.out.print(" dinara.");
	}
}