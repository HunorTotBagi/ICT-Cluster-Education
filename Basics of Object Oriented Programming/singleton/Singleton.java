package singleton;

public class Singleton {
	private String s;
	private static Singleton instance = null;
	
	protected Singleton(String s) {
		this.setS(s);
	}
	
	public static Singleton getInstance(String s) {
		if (instance == null) {
			instance = new Singleton(s);
		}
		return instance;
	}
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}