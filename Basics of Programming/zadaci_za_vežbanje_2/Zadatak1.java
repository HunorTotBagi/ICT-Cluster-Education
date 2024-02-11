package zadaci_za_vežbanje_2;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		
		int temp = array[0];
		
		for(int i=1; i < array.length; i++) {
			array[i-1] = array[i];
		}
		
		array[array.length-1] = temp;
		
		for(int i=0; i < array.length; i++) {
			System.out.println("Na poziciji " + (i + 1)+ " se nalazi " + array[i]);
		}
	}
}