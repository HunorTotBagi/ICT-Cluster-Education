package secondObligatoryHomework;

public interface OperationsTeam {
	void addTeam(Team inputTeam);

	void removeTeam(Team inputTeam);

	int findTeam(String teamName);

	int findTeam(String teamName, Boolean printConsoleMessage);
}
