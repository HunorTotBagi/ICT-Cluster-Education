package jmbg_arrayList;


public class Main {

	public static void main(String[] args) {

		ListOfPersons first = new ListOfPersons();
		
		first.readList("spisakPolaznika.txt");
		
		first.printList();
 				
		first.sort();
	}

}
