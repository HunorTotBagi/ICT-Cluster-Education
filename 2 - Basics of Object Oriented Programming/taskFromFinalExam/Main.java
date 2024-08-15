package taskFromFinalExam;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public ArrayList<Programmer> readList() {
		Scanner s = null;
		ArrayList<Programmer> list = new ArrayList<Programmer>();

		try {
			s = new Scanner(new File("programmersList.txt"));
			do {
				String firstName = s.next();
				String lastName = s.next();
				int age = Integer.parseInt(s.next());
				String seniority = s.next();
				double salary = Double.parseDouble(s.next());
				Programmer newProgrammer = new Programmer(firstName, lastName, age, seniority, salary);
				list.add(newProgrammer);
			} while (s.hasNext());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return list;
	}
}
