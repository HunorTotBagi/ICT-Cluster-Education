package interface3example;

public class Derived extends Base {
	private int number;

	public Derived() {
	}

	public Derived(int number) {
		this.number = number;
	}

	public void show() {
		System.out.printf("\nNumber is", this.number);
	}

	public void function() {
	}
}
