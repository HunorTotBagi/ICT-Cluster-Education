package ugradjeniObjekti;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int a = -5;
		
		int result1 = (a < 0) ? -a : a;
		int result2 = Math.abs(a);
		
		System.out.println("Apsolutna vrednost sa ternarnim operatorom: " + result1);
		System.out.println("Apsolutna vrednost sa ugrađenom funkcijom: " + result2);
		
	}
}