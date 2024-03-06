package jmbg_arrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfPersons {
	public ArrayList<Person> listOfPersons;

	public void printList() {
		for (int i = 0; i < listOfPersons.size(); i++) {
			System.out.println(listOfPersons.get(i).getFirstName());
			System.out.println(listOfPersons.get(i).getLastName());
			System.out.println(listOfPersons.get(i).getJmbg());
			System.out.println();
		}
	}

	public void readList(String fileName) {
		Scanner s = null;
		ArrayList<Person> listOfPersons = new ArrayList<Person>();

		try {
			s = new Scanner(new File(fileName));
			do {
				String firstName = s.next();
				String lastName = s.next();
				String jmbg = s.next();
				Person newPerson = new Person(firstName, lastName, jmbg);
				listOfPersons.add(newPerson);
			} while (s.hasNext());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
		this.listOfPersons = listOfPersons;
	}

	public void sortAscending() {
		int n = listOfPersons.size();

		double[] jmbgArray = new double[n];
		int[] index = new int[n];

		for (int i = 0; i < n; i++) {
			String jmbg = listOfPersons.get(i).getJmbg();
			jmbgArray[i] = Double.parseDouble(jmbg);
			index[i] = i;
		}

		sort(n, jmbgArray, index);
		printSortedList(n, index);
	}

	private void printSortedList(int n, int[] index) {
		for (int i = 0; i < n; i++) {
			System.out.println(listOfPersons.get(index[i]).getFirstName());
			System.out.println(listOfPersons.get(index[i]).getLastName());
			System.out.println(listOfPersons.get(index[i]).getJmbg());
			System.out.println();
		}
	}

	private void sort(int n, double[] jmbg, int[] index) {
		for (int j = 1; j < n; j++) {
			for (int i = 0; i < n - j; i++) {
				if (jmbg[i + 1] < jmbg[i]) {
					swapJmbg(jmbg, i);
					swapIndex(index, i);
				}
			}
		}
	}

	private void swapIndex(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

	private void swapJmbg(double[] array, int i) {
		double temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}
}