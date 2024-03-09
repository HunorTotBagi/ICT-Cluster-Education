package secondObligatoryHomework;

public interface WorkWithTeams {
	void addTeam(Team inputTeam);

	void removeTeam(Team inputTeam);

	int findTeam(String teamName);

	int findTeam(String teamName, Boolean printConsoleMessage);
}
