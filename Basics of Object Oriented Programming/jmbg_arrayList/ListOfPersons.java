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

	public void sort() {
		System.out.println("");
		System.out.println("SORT");
		System.out.println("");
	    int n = listOfPersons.size();
	    double[] jmbg = new double[n];
	    int[] index = new int[n];

	    for (int i = 0; i < n; i++) {
	    	String jmbg1 = listOfPersons.get(i).getJmbg();
	        jmbg[i] = Double.parseDouble(jmbg1);
	        index[i] = i;
	    }

	    for (int j = 1; j < n; j++) {
	        for (int i = 0; i < n - j; i++) {
	            if (jmbg[i + 1] < jmbg[i]) {
	            	double temp = jmbg[i];
	                int temp1 = index[i];
	                jmbg[i] = jmbg[i + 1];
	                index[i] = index[i + 1];
	                jmbg[i + 1] = temp;
	                index[i + 1] = temp1;
	            }
	        }
	    }

	    for (int i = 0; i < n; i++) {
	        System.out.println(listOfPersons.get(index[i]).getFirstName());
	        System.out.println(listOfPersons.get(index[i]).getLastName());
	        System.out.println(listOfPersons.get(index[i]).getJmbg());
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

}
