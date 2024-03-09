package secondObligatoryHomework;

public class UnitTestsTeam {

	public static void main(String[] args) {
		Team crvenaZvezda = new Team("Crvena Zvezda", "Belgrade", 15);
		Team partizan = new Team("Partizan", "Belgrade", 14);
		Team vojvodina = new Team("Vojvodina", "Novi Sad", 13);

		ListOfTeams teams = new ListOfTeams();

		teams.addTeam(crvenaZvezda);
		teams.addTeam(partizan);

		System.out.println();
		teams.findTeam("Crvena Zvezda");
		teams.findTeam("Vojvodina");

		System.out.println();
		teams.removeTeam(vojvodina);
		teams.removeTeam(partizan);
	}
}