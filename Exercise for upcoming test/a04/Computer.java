package a04;

public class Computer {
	private String processor;
	private double workTact, performanceIndex;
	private int memory;

	public Computer(String processor, double workTact, int memory) {
		this.processor = processor;
		this.workTact = workTact;
		this.memory = memory;
	}

	public void calculatePerformanceIndex() {
		this.setPerformanceIndex(10 * this.getWorkTact() + this.getMemory());
	}

	public void printPerformanceIndex() {
		System.out.printf("For computer with processor %s the performance index is %.2f. %n", this.getProcessor(),
				this.getPerformanceIndex());
	}

	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getWorkTact() {
		return this.workTact;
	}

	public void setWorkTact(double workTact) {
		this.workTact = workTact;
	}

	public int getMemory() {
		return this.memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getPerformanceIndex() {
		return performanceIndex;
	}

	private void setPerformanceIndex(double performanceIndex) {
		this.performanceIndex = performanceIndex;
	}
}