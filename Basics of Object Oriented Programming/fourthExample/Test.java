package fourthExample;

public class Test {

	public static void main(String[] args) {
		Computer firstComputer = new Computer();
		Computer secondComputer = new Computer();
		Computer thirdComputer = new Computer();
		Computer fourthComputer = new Computer();
		Computer fifthComputer = new Computer();

		firstComputer.setProcessorName("Comodor");
		firstComputer.setWorkingTact(4);
		firstComputer.setMemoryCapacity(2);

		secondComputer.setProcessorName("Pentium 1");
		secondComputer.setWorkingTact(6);
		secondComputer.setMemoryCapacity(5);

		thirdComputer.setProcessorName("Pentium 2");
		thirdComputer.setWorkingTact(7);
		thirdComputer.setMemoryCapacity(6);

		fourthComputer.setProcessorName("Pentium 3");
		fourthComputer.setWorkingTact(16);
		fourthComputer.setMemoryCapacity(7);

		fifthComputer.setProcessorName("Pentium 4");
		fifthComputer.setWorkingTact(32);
		fifthComputer.setMemoryCapacity(8);

		firstComputer.getPerformanceIndex();
		secondComputer.getPerformanceIndex();
		thirdComputer.getPerformanceIndex();
		fourthComputer.getPerformanceIndex();
		fifthComputer.getPerformanceIndex();

		Computer[] computerArray = new Computer[] { fifthComputer, firstComputer, fourthComputer, secondComputer, thirdComputer };

		bubbleSortDescending(computerArray);

		System.out.println("Performance index in descending order: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s have performance index: %f %n", computerArray[i].processor,
					computerArray[i].performanceIndex);
		}
	}

	private static void bubbleSortDescending(Computer[] array) {
		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i].performanceIndex < array[i + 1].performanceIndex) {
					swap(array, i);
				}
			}
		}
	}

	private static void swap(Computer[] array, int i) {
		Computer temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}
}