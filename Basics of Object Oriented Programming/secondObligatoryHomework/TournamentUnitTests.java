package secondObligatoryHomework;

public class TournamentUnitTests {

	public static void main(String[] args) {
		Team crvenaZvezda = new Team("Crvena Zvezda", "Belgrade", 15);
		Team partizan = new Team("Partizan", "Belgrade", 14);
		Team vojvodina = new Team("Vojvodina", "Novi Sad", 13);

		TeamList teams = new TeamList();

		teams.addTeam(crvenaZvezda);
		teams.addTeam(partizan);
		teams.addTeam(vojvodina);

		System.out.println();
		Tournament tournament = new Tournament();
		tournament.calculateFund(teams);
		tournament.printAwards(teams);
	}
}