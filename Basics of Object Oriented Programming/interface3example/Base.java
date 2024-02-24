package interface3example;

public abstract class Base implements Interface {

	public Base() {
		System.out.println("Consturctor for base called");
	}

	public abstract void function();

	public void show() {
		System.out.println("Calling show from Base");
		System.out.println(number);
	}
}