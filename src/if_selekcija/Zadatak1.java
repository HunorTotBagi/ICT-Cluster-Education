package if_selekcija;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int ocena;

		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		
		System.out.print("Unesite ocenu: ");
		ocena = TextIO.getlnInt();

		while (ocena < 0 || 5 < ocena)
		{
			System.out.println(" ");
			System.out.println("Uneli ste pogrešan broj!");
			System.out.println("Unesite ocenu ponovo: ");
			ocena = TextIO.getlnInt();
		}
		
		if (ocena == 1)
			System.out.println("Nedovoljan!");
		else if (ocena == 2)
			System.out.println("Dovoljan!");
		else if (ocena == 3)
			System.out.println("Dobar!");
		else if (ocena == 4)
			System.out.println("Vrlo dobar!");
		else
			System.out.println("Odlican!");

	}

}
