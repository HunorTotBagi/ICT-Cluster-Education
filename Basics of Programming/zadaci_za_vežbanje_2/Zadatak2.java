package zadaci_za_vežbanje_2;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		System.out.println("Vrednost promenljive a je: " + a);
		System.out.println("Vrednost promenljive b je: " + b);
		
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("");
		System.out.println("Varijable posle zamene mesta");
		System.out.println("");
		
		System.out.println("Vrednost promenljive a je sada: " + a);
		System.out.println("Vrednost promenljive b je sada: " + b);
	}
}