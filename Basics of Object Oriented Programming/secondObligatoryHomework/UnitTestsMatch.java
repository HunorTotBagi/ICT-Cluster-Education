package secondObligatoryHomework;

import secondObligatoryHomework.Match.Result;

public class UnitTestsMatch {

	public static void main(String[] args) {
		Team crvenaZvezda = new Team("Crvena Zvezda", "Belgrade", 15);
		Team partizan = new Team("Partizan", "Belgrade", 14);
		Team vojvodina = new Team("Vojvodina", "Novi Sad", 13);
		Team radnicki = new Team("Radnički", "Niš", 12);

		Match zvezdaVsPartizan = new Match(crvenaZvezda.getName(), partizan.getName(), Result.FIRST_WON);
		Match vojvodinaVsRadnicki = new Match(vojvodina.getName(), radnicki.getName(), Result.TIED);
		Match partizanVsVojvodina = new Match(partizan.getName(), vojvodina.getName(), Result.SECOND_WON);
		Match zvezdaVsRadnicki = new Match(crvenaZvezda.getName(), radnicki.getName(), Result.UNPLAYED);

		ListOfMatches matches = new ListOfMatches();

		matches.addMatch(zvezdaVsPartizan);
		matches.addMatch(vojvodinaVsRadnicki);
		matches.addMatch(partizanVsVojvodina);

		System.out.println();
		matches.findMatch(crvenaZvezda.getName(), partizan.getName());
		matches.findMatch(crvenaZvezda.getName(), vojvodina.getName());

		System.out.println();
		matches.removeMatch(zvezdaVsPartizan);
		matches.removeMatch(zvezdaVsRadnicki);
	}
}