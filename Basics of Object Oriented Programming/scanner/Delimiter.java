package scanner;

import java.util.Scanner;

public class Delimiter {

	public static void main(String[] args) {
		String ulaz = "10 caj 20 kafa 30 vocni sok";
		Scanner s = new Scanner(ulaz).useDelimiter("\\s");
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		s.close();
	}
}
