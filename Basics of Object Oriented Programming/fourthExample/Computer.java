package fourthExample;

public class Computer {
	private String processor;
	private double workingTact;
	private int memoryCapacity;
	
	public void setProcessorName(String input) {
		this.processor = input;
	}
	
	public String getProcessorName() {
		return this.processor;
	}
	
	public void setWorkingTact(double input) {
		this.workingTact = input;
	}
	
	public double getWorkingTact() {
		return this.workingTact;
	}
	
	public void setMemoryCapacity(int input) {
		this.memoryCapacity = input;
	}
	
	public int getMemoryCapacity() {
		return this.memoryCapacity;
	}
	
	public double getPerformanceIndex() {
		return 10 * this.getWorkingTact() + this.getMemoryCapacity();
	}
	
	public void displayPerformanceIndex() {
		System.out.printf("Performance index is: %f ", this.getPerformanceIndex());
	}
}