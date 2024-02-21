package exerciseHasA;

public class Test {

	public static void main(String[] args) {
		Employee zakonskiCovek = new Employee("Imenko", "Prezimenkovic", 34, 5);
		Institucija pmf = new Institucija("PMF", "Adress 1", "0001", zakonskiCovek);
		
		
		pmf.dodajUcionicu("oznaka", "Racunarska", 5, 30);
		pmf.dodajZaposleni("Isaac", "Newton", 50, 999);
		
		pmf.printArray();

	}

}
