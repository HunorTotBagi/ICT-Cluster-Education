package a04;

public class Main {

	public static void main(String[] args) {
		Computer intel7 = new Computer("Intel Core i7", 3.4, 16);
		Computer amd5 = new Computer("AMD Ryzen 5", 3.2, 8);
		Computer intel5 = new Computer("Intel Core i5", 2.8, 12);
		Computer amd7 = new Computer("AMD Ryzen 7 ", 3.6, 32);
		Computer intel9 = new Computer("Intel Core i7", 4, 64);
		
		intel7.calculatePerformanceIndex();
		amd5.calculatePerformanceIndex();
		intel5.calculatePerformanceIndex();
		amd7.calculatePerformanceIndex();
		intel9.calculatePerformanceIndex();
		
		intel7.printPerformanceIndex();
		amd5.printPerformanceIndex();
		intel5.printPerformanceIndex();
		amd7.printPerformanceIndex();
		intel9.printPerformanceIndex();
	}
}