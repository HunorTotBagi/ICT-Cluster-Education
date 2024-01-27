package ulaz_izlal;

public class Zadatak1 {

	public static void main(String[] args) {

		int broj;
		int kvadrat;

		System.out.print("Unesite neki ceo broj: ");
		broj = TextIO.getlnInt();
		kvadrat = broj * broj;

		System.out.println();
		System.out.println("Broj koji ste uneli je " + broj);
		System.out.println("Kvadrat unetog broja je " + kvadrat);
		System.out.println();

	}
}