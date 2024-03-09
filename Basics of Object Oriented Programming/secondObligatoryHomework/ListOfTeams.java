package secondObligatoryHomework;

import java.util.ArrayList;

public class ListOfTeams implements WorkWithTeams {
	private ArrayList<Team> teams;

	public ListOfTeams() {
		this.setTeams(new ArrayList<>());
	}

	public void addTeam(Team inputTeam) {
		this.getTeams().add(inputTeam);
		System.out.printf("Team %s from %s with %d players added to list of teams.%n", inputTeam.getName(),
				inputTeam.getOriginCity(), inputTeam.getNumberOfPlayers());
	}

	public void removeTeam(Team inputTeam) {
		String teamName = inputTeam.getName();

		if (findTeam(teamName, false) == -1) {
			System.out.printf("Error: The team %s you are trying to remove is not in the list of teams!%n", teamName);
		} else {
			this.getTeams().remove(inputTeam);
			System.out.printf("Team %s removed from list of teams.%n", teamName);
		}
	}

	public int findTeam(String teamName) {
		return findTeam(teamName, true);
	}

	public int findTeam(String teamName, Boolean printConsoleMessage) {
		for (int i = 0; i < this.getTeams().size(); i++) {
			if (this.getTeams().get(i).getName().equals(teamName)) {
				if (printConsoleMessage)
					System.out.printf("Team %s is in the list of teams on position %d.%n", teamName, i + 1);
				return i;
			}
		}
		if (printConsoleMessage)
			System.out.printf("Team %s is not in the list of teams.%n", teamName);
		return -1;
	}

	public ArrayList<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
}