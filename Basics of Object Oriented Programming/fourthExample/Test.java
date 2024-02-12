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
		
		secondComputer.setProcessorName("Pentium");
		secondComputer.setWorkingTact(6);
		secondComputer.setMemoryCapacity(5);
		
		thirdComputer.setProcessorName("Pentium1");
		thirdComputer.setWorkingTact(7);
		thirdComputer.setMemoryCapacity(6);
		
		fourthComputer.setProcessorName("Pentium2");
		fourthComputer.setWorkingTact(16);
		fourthComputer.setMemoryCapacity(7);
		
		fifthComputer.setProcessorName("Pentium4");
		fifthComputer.setWorkingTact(32);
		fifthComputer.setMemoryCapacity(8);
		
		double[] array = new double[5];
		String[] nameArray = new String[5];
		
		nameArray[0] = firstComputer.processor; 
		nameArray[1] = secondComputer.processor; 
		nameArray[2] = thirdComputer.processor; 
		nameArray[3] = fourthComputer.processor; 
		nameArray[4] = fifthComputer.processor; 
		
		array[0] = firstComputer.getPerformanceIndex();
		array[1] = secondComputer.getPerformanceIndex();
		array[2] = thirdComputer.getPerformanceIndex();
		array[3] = fourthComputer.getPerformanceIndex();
		array[4] = fifthComputer.getPerformanceIndex();
		
		sortByDescendingOrder(array, nameArray);
		
		System.out.println("Performance index in descending order: %n");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.printf("%s have performance index: %f %n", nameArray[i], array[i]);
		}
	}
	
	private static void sortByDescendingOrder(double[] array, String[] nameArray) {
		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i + 1] > array[i]) {
					swapInt(array, i);
					swapStr(nameArray, i);
				}
			}
		}
	}
	
	private static void swapInt(double[] array, int i) {
		double temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}
	
	private static void swapStr(String[] array, int i) {
		String temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}
}