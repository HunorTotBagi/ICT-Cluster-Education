package secondObligatoryHomework;

import secondObligatoryHomework.Match.Result;

public class Main {

	public static void main(String[] args) {
		TeamList teams = new TeamList();
		teams.readFromFile("teams.txt");

		teams.findTeam("Crvena Zvezda");
		teams.findTeam("Partizan");
		teams.findTeam("Vojvodina");
		teams.findTeam("Radnički");

		PlayerList players = new PlayerList();
		players.readFromFile("players.txt");

		System.out.println();
		players.findPlayer("Filip", "Stojanović");
		players.findPlayer("Hunor", "Tot-Bagi");
		players.findPlayer("Era", "Ojdanić");

		MatchList matches = new MatchList();

		System.out.println();
		Match zvezdaVsVojvodina = new Match("Crvena Zvezda", "Vojvodina", Result.SECOND_WON);
		Match partizanVsradnicki = new Match("Partizan", "Radnički", Result.FIRST_WON);
		Match vojvodinaVsPartizanTied = new Match("Vojvodina", "Partizan", Result.TIED);
		Match vojvodinaVsPartizan = new Match("Vojvodina", "Partizan", Result.FIRST_WON);
		Match zvezdaVsRadnickiUnplayed = new Match("Crvena Zvezda", "Radnički", Result.UNPLAYED);
		Match zvezdaVsRadnicki = new Match("Crvena Zvezda", "Radnički", Result.FIRST_WON);

		matches.addMatch(zvezdaVsVojvodina);
		matches.addMatch(partizanVsradnicki);
		matches.addMatch(vojvodinaVsPartizanTied);
		matches.addMatch(vojvodinaVsPartizan);
		matches.addMatch(zvezdaVsRadnickiUnplayed);
		matches.addMatch(zvezdaVsRadnicki);

		matches.calculateScores(matches, teams);
		
		System.out.println();
		teams.printTeamScores();
		
		System.out.println();
				
		Tournament tournament = new Tournament(teams.getNumberOfTeams());
		tournament.calculateFund(teams);
		tournament.printAwards(teams);
		
		System.out.println();
		teams.sortByScore(tournament);
		
		matches.writeToFile("matches.txt");
	}
}