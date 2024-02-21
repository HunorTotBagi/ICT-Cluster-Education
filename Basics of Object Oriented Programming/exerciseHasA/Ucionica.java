package exerciseHasA;

public class Ucionica {
	protected String oznaka, tip;
	protected int brMesta;
	protected double povrsina;
	
	public Ucionica(String oznaka, String tip, int brMesta, double povrsina) {
		this.setOznaka(oznaka);
		this.setTip(tip);
		this.setBrMesta(brMesta);
		this.setPovrsina(povrsina);
	}
	
	public String toString() {
		return oznaka + " (" + tip + "), broj mesta: " + brMesta + ", povrsina: " + povrsina + " m2";
	}
	
	public String getOznaka() {
		return this.oznaka;
	}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrMesta() {
		return this.brMesta;
	}

	public void setBrMesta(int brMesta) {
		this.brMesta = brMesta;
	}

	public double getPovrsina() {
		return this.povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
}