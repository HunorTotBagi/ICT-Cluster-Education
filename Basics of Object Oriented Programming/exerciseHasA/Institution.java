package exerciseHasA;

public class Institution {
	private static final int maxBroj = 20;
	private String naziv, adresa, maticniBroj;
	private Employee zakonskiZastupnik;
	private Classroom[] spisakUcionica;
	private Employee[] spisakZaposlenih;
	private int brojUcionica, brojZaposlenih;
	
	public Institution(String naziv, String adresa, String maticniBroj, Employee zakonskiZastupnik) {
		this.setNaziv(naziv);
		this.setAdresa(adresa);
		this.setMaticniBroj(maticniBroj);
		this.setZakonskiZastupnik(zakonskiZastupnik);
		this.setSpisakUcionica(new Classroom[maxBroj]);
		this.setBrojUcionica(0);
		this.setSpisakZaposlenih(new Employee[maxBroj]);
		this.setBrojZaposlenih(0);
	}
	
	public boolean addClassroom(String oznaka, String tip, int brMesta, double povrsina) {
		if (this.brojUcionica == maxBroj)
			return false;

		spisakUcionica[brojUcionica] = new Classroom(oznaka, tip, brMesta, povrsina);
		this.brojUcionica++;

		return true;
	}
	
	public boolean addEmployee(String firstName, String lastName, int age, int workingPlaceCoef) {
		if (this.brojZaposlenih == maxBroj)
			return false;

		spisakZaposlenih[brojZaposlenih] = new Employee(firstName, lastName, age, workingPlaceCoef);
		this.brojZaposlenih++;

		return true;
	}
	

	public void printArray() {
		for (int i = 0 ; i < brojZaposlenih ; i++) {
			System.out.printf("%d. Employee: %s %s", i+1, spisakZaposlenih[i].getFirstName(), spisakZaposlenih[i].getLastName());
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

	public Classroom[] getSpisakUcionica() {
		return this.spisakUcionica;
	}

	public void setSpisakUcionica(Classroom[] spisakUcionica) {
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
