package exerciseHasA;

public class Institucija {
	private static final int maxBroj = 20;
	private String naziv, adresa, maticniBroj;
	private Employee zakonskiZastupnik;
	private Ucionica[] spisakUcionica;
	private Employee[] spisakZaposlenih;
	private int brojUcionica, brojZaposlenih;
	
	public Institucija(String naziv, String adresa, String maticniBroj, Employee zakonskiZastupnik) {
		this.setNaziv(naziv);
		this.setAdresa(adresa);
		this.setMaticniBroj(maticniBroj);
		this.setZakonskiZastupnik(zakonskiZastupnik);
		this.setSpisakUcionica(new Ucionica[maxBroj]);
		this.setBrojUcionica(0);
		this.setSpisakZaposlenih(new Employee[maxBroj]);
		this.setBrojZaposlenih(0);
	}
	
	public boolean dodajUcionicu(String oznaka, String tip, int brMesta, double povrsina) {
		if (this.brojUcionica == maxBroj)
			return false;
		//if (racunarska) {
		//	spisakUcionica[brojUcionica++] = new RacunarskaUcionica(oznaka, tip, brMesta, povrsina);
		//}
		//else {
		spisakUcionica[brojUcionica] = new Ucionica(oznaka, tip, brMesta, povrsina);
		this.brojUcionica++;
		//}
		return true;
	}
	
	public boolean dodajZaposleni(String firstName, String lastName, int age, int workingPlaceCoef) {
		if (this.brojZaposlenih == maxBroj)
			return false;
		//if (racunarska) {
		//	spisakUcionica[brojUcionica++] = new RacunarskaUcionica(oznaka, tip, brMesta, povrsina);
		//}
		//else {
		spisakZaposlenih[brojZaposlenih] = new Employee(firstName, lastName, age, workingPlaceCoef);
		this.brojZaposlenih++;
		//}
		return true;
	}
	
	// TODO
	
	public void printArray() {
		for (int i = 0 ; i < brojZaposlenih ; i++) {
			System.out.printf("%s", spisakZaposlenih[i].getFirstName());
		}
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMaticniBroj() {
		return this.maticniBroj;
	}

	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public Employee getZakonskiZastupnik() {
		return this.zakonskiZastupnik;
	}

	public void setZakonskiZastupnik(Employee zakonskiZastupnik) {
		this.zakonskiZastupnik = zakonskiZastupnik;
	}

	public Ucionica[] getSpisakUcionica() {
		return this.spisakUcionica;
	}

	public void setSpisakUcionica(Ucionica[] spisakUcionica) {
		this.spisakUcionica = spisakUcionica;
	}

	public Employee[] getSpisakZaposlenih() {
		return this.spisakZaposlenih;
	}

	public void setSpisakZaposlenih(Employee[] spisakZaposlenih) {
		this.spisakZaposlenih = spisakZaposlenih;
	}

	public int getBrojUcionica() {
		return this.brojUcionica;
	}

	public void setBrojUcionica(int brojUcionica) {
		this.brojUcionica = brojUcionica;
	}

	public int getBrojZaposlenih() {
		return this.brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}

	public static int getMaxbroj() {
		return maxBroj;
	}
}
