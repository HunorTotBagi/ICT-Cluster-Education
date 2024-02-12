package fourthExample;

public class Computer {
	String processor;
	double workingTact, performanceIndex;
	int memoryCapacity;
	
	void setProcessorName(String input) {
		processor = input;
	}
	
	void setWorkingTact(double input) {
		workingTact = input;
	}
	
	void setMemoryCapacity(int input) {
		memoryCapacity = input;
	}
	
	double getPerformanceIndex() {
		performanceIndex = 10 * workingTact + memoryCapacity;
		return performanceIndex;
	}
	
	void displayPerformanceIndex() {
		System.out.printf("Performance index is: %f ", performanceIndex);
	}
}