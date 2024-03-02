package final_test_example;

public class Task_three {

	public static void main(String[] args) {
		int a = 5;
		int b = 3 * a + a - 3;
		
		for ( int i = 0 ; i <= b ; i++) {
			if (i%2 != 0) {
				continue; 
			}
			System.out.println("Q");
		}
	}
}