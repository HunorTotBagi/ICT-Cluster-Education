package secondObligatoryHomework;

import secondObligatoryHomework.Match.Result;

public class Main {

	public static void main(String[] args) {
		ListOfTeams teams = new ListOfTeams();
		teams.readFromFile("teams.txt");

		teams.findTeam("Crvena Zvezda");
		teams.findTeam("Partizan");
		teams.findTeam("Vojvodina");
		teams.findTeam("Radnički");

		ListOfPlayers players = new ListOfPlayers();
		players.readFromFile("players.txt");

		System.out.println();
		players.findPlayer("Filip", "Stojanović");
		players.findPlayer("Hunor", "Tot-Bagi");

		ListOfMatches matches = new ListOfMatches();

		System.out.println();
		Match zvezdaVsVojvodina = new Match("Crvena Zvezda", "Vojvodina", Result.SECOND_WON);
		Match PartizanVsradnicki = new Match("Partizan", "Radnički", Result.FIRST_WON);
		Match VojvodinaVsPartizanTied = new Match("Vojvodina", "Partizan", Result.TIED);
		Match VojvodinaVsPartizan = new Match("Vojvodina", "Partizan", Result.FIRST_WON);
		Match zvezdaVsRadnickiUnplayed = new Match("Crvena Zvezda", "Radnički", Result.UNPLAYED);
		Match zvezdaVsRadnicki = new Match("Crvena Zvezda", "Radnički", Result.FIRST_WON);

		matches.addMatch(zvezdaVsVojvodina);
		matches.addMatch(PartizanVsradnicki);
		matches.addMatch(VojvodinaVsPartizanTied);
		matches.addMatch(VojvodinaVsPartizan);
		matches.addMatch(zvezdaVsRadnickiUnplayed);
		matches.addMatch(zvezdaVsRadnicki);

		matches.calculateScores(matches, teams);
		
		System.out.println();
		teams.printTeamScores();
		
		System.out.println();
		CompetitionFund fund = new CompetitionFund();
		fund.calculateFund(teams);
		fund.printAwards(teams);
		
		System.out.println();
		teams.sortByScore(fund);
		

	}
}