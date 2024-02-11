package prvi_projekat;

public class PrviProjekat {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		double investicija; 
		double stopa; 
		double zarada; 
				
		investicija = 1000;
		stopa = 0.027;
		zarada = investicija * stopa; 
		investicija = investicija + zarada;
		

		System.out.print("Za godinu dana zaradjeno je: ");
		System.out.print(zarada);
		System.out.println(" dinara.");
		
		System.out.print("Ukupna vrednost investije je sada: ");
		System.out.print(investicija);
		System.out.print(" dinara.");

	}
}