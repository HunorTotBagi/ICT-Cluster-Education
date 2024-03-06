package jmbg_arrayList;

public class Main {

	public static void main(String[] args) {

		ListOfPersons mainList = new ListOfPersons();
		
		mainList.readList("spisakPolaznika.txt");
		mainList.printList();
 				
		System.out.println("Sorting by JMBG in progress...");
		System.out.println("");
		
		mainList.sortAscending();
	}
}